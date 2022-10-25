package AA.SeleniumFrameworkDesign.tests.TestComponents;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AA.SeleniumFrameworkDesign.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;

	public WebDriver initializedDriver() throws IOException {

//		Properties prop = new Properties();
//		FileInputStream fin = new FileInputStream(
//				"C:\\Users\\Arthur\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\main\\java\\resources\\GlobalData.properties");
//
//		System.out.println(fin);
//		prop.load(fin);
//		String browserName = prop.getProperty("browser");

//		System.out.println(browserName);
//		if (browserName.contentEquals("Chrome")) {

//		String BrowserName = "chrome";

//	System.getProperty("browser") == "chrome" ? treste = "treste" : trest e=  "urso";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}

	public LandingPage launchApplication() throws IOException {
		initializedDriver();
		LandingPage landingPage = new LandingPage(getDriver());
		landingPage.goTo();
		return landingPage;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public String takeScreenshot(String testCaseMame, WebDriver Driver) throws IOException {
//		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//		// Copy the file to a location and use try catch block to handle exception
//
//		FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") + "//reports//"));
		File setup = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseMame + ".png");
		FileUtils.copyFile(setup, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseMame + ".png";
	}

}
