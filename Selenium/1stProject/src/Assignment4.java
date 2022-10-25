import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://the-internet.herokuapp.com";
		driver.get(url);

//		driver.manage().window().maximize();

		WebElement firsttLink = driver.findElement(By.xpath("(//a[normalize-space()='Multiple Windows'])[1]"));
		firsttLink.click();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();
		String childID = it.next();

		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		driver.findElement(By.cssSelector("a[href=\"/windows/new\"]")).click();

		String childIDSub = it.next();
		driver.switchTo().window(childIDSub);
		
		
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		System.out.println(windows);

//		driver.switchTo().window(parentID);
//	

//		Actions a = new Actions(driver);
	}

}
