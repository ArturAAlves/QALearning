package TEST.WortenQA_v2;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;




public class DriverAdapter {
	public WebDriver driver;

	public Actions actions;


	public WebDriver create(String browserName) {
		switch (browserName) {
		case "CHROME":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized", "--disable-notifications", "window-size=1200x600");
			this.driver = new ChromeDriver(options);

			this.actions = new Actions(driver);
			break;

		case "FIREFOX":
			WebDriverManager.firefoxdriver().setup();
			break;

		default:
			break;
		}
		return driver;
	}

	public void open(String url) {
		driver.get(url);
	}

	public void close() {
		driver.close();
	}

//	public void by(String Type, String Selector) {
//		webDriver.get().findElement(By.css(Selector));
//
//	}

//	public static DevTools devToolsInitialzer(ChromeDriver driver) {
//		devTools = driver.getDevTools();
//		devTools.createSession();
//		return devTools;
//	}

}