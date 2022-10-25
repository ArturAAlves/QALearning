
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MiscellaneousTopics {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
//		options.addExtensions(null);

		Date date = new Date();

		System.out.println(date.toString().replace(" ", "-").replace(":", "_"));

		// setting proxys
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("apaapap:4444");
		options.setCapability("proxy", proxy);

		ChromeDriver driver = new ChromeDriver(options);
		String url = "https://expired.badssl.com/";

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().addCookie(null);
		driver.get(url);

		File sCshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(sCshot, new File("C:\\Users\\Arthur\\Desktop\\QA\\screenshots\\screen.png"));

//		String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

	}

}
