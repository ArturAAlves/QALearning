import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v104.fetch.Fetch;

public class NetworkMocking {
	static ChromeDriver driver;
	static DevTools devTools;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = Utils.webDriverInitializer("chrome");
		devTools = Utils.devToolsInitialzer(driver);
		
		
		devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));

		devTools.addListener(Fetch.requestPaused(), request -> {

//			System.out.println(request.getRequest().getUrl());

			Optional<String> url = Optional.of(request.getRequest().getUrl());
			Optional<String> google = Optional.of("https://www.google.com");

			if (url.toString().contains("sapooos")) {

				devTools.send(Fetch.continueRequest(request.getRequestId(), url, Optional.empty(), Optional.empty(),
						Optional.empty(), Optional.empty()));

			} else {

				devTools.send(Fetch.continueRequest(request.getRequestId(), google, Optional.empty(), Optional.empty(),
						Optional.empty(), Optional.empty()));
			}

		});
		
		
		driver.get("https://www.sapo.pt");
		

	}

}
