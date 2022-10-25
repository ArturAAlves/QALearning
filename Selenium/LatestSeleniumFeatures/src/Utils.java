import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {
	static ChromeDriver driver;
	static DevTools devTools;

	public static ChromeDriver webDriverInitializer(String browserName) {
		if (browserName == "chrome") {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		return driver;
	}

	public static DevTools devToolsInitialzer(ChromeDriver driver) {
		devTools = driver.getDevTools();
		devTools.createSession();
		return devTools;
	}
	
	

	

}
