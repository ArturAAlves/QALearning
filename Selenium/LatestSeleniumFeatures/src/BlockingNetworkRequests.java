import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v104.network.Network;

import com.google.common.collect.ImmutableList;

public class BlockingNetworkRequests {
	static ChromeDriver driver = Utils.webDriverInitializer("chrome");
	static DevTools devTools = Utils.devToolsInitialzer(driver);

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

		devTools.send(
				Network.setBlockedURLs(ImmutableList.of("i.ytimg.com","*hq720.jpg", "*jpg", "*.jpg", "*.css", "*.mp3", "*.woff2")));

		driver.get("http://www.youtube.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".style-scope .ytd-button-renderer .style-primary .size-default")).click();
	}

}
