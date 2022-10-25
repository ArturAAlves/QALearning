import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.io.File;
import java.io.IOException;

public class SeleniumV4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

//		By locator = RelativeLocator.with(By.tagName("label")).above(By.xpath("(//input[@name='name'])[1]"));

		WebElement nameInputBox = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		WebElement txtEmail = driver.findElement(with(By.tagName("label")).above(nameInputBox));

//		System.out.println(nameInputBox);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://rahulshettyacademy.com/");
		String test = driver
				.findElement(
						By.xpath("(//span[contains(text(),'World class Tutorials on Selenium, Rest Assured, P')])[1]"))
				.getText();

		Object[] windowHandles = driver.getWindowHandles().toArray();
		Object mainWindow = windowHandles[0];

		driver.switchTo().window((String) mainWindow);
		WebElement textInput = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		textInput.sendKeys(test);

		File file = textInput.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("name.png"));
	}

}
