package cucumber;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	private WebDriver driver;
	public String homePageUrl;
	public String cartPageUrl;
	public String selectCountryPageUrl;

	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/resources/global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		homePageUrl = prop.getProperty("homePageUrl");
		cartPageUrl = prop.getProperty("cartPageUrl");
		selectCountryPageUrl = prop.getProperty("selectCountryPageUrl");
		String browser = prop.getProperty("browser");

		if (driver == null) {
			if (browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized", "--disable-notifications", "window-size=1200x600");
				driver = new ChromeDriver(options);
				driver.get(homePageUrl);
			} else {
				System.out.println("other browser");
			}

		}

		return driver;
	}

	private boolean typeof(String browser) {
		// TODO Auto-generated method stub
		return false;
	}
}
