import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v104.fetch.Fetch;
import org.openqa.selenium.devtools.v104.fetch.model.RequestPattern;

public class NetworkFailRequest {
	static ChromeDriver driver = Utils.webDriverInitializer("chrome");
	static DevTools devTools = Utils.devToolsInitialzer(driver);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));

		Optional<List<RequestPattern>> patterns = Optional
				.of(Arrays.asList(new RequestPattern(Optional.of("getbook"), Optional.empty(), Optional.empty())));

		devTools.send(Fetch.enable(patterns, null));
	}

}
