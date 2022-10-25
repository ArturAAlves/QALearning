import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
//		driver.manage().window().maximize();

		WebElement link = driver.findElement(By.className("blinkingText"));
		link.click();

//		String mainWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();

		driver.switchTo().window(childID);
		String textSource = driver.findElement(By.cssSelector("a[href=\"mailto:mentor@rahulshettyacademy.com\"]"))
				.getText();

		driver.switchTo().window(parentID);
		WebElement userNameInput = driver.findElement(By.id("username"));
		userNameInput.sendKeys(textSource);

		System.out.println(textSource);
		

//		Actions a = new Actions(driver);

	}

}
