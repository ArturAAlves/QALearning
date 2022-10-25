import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_nestedFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://the-internet.herokuapp.com";
		driver.get(url);
		driver.findElement(By.xpath("(//a[normalize-space()='Nested Frames'])[1]")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String childPage = it.next();
		driver.switchTo().window(childPage);
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		String middleFrameText = driver.findElement(By.id("content")).getText();
		System.out.println(middleFrameText);

//		WebElement middleFrame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));	
//		driver.switchTo().frame(0);
//		WebElement outerFrame = driver.findElement(By.cssSelector("frameset[frameborder=\"1\"]"));

//		WebElement topFrame = driver.findElement(By.xpath("//frame[@name='frame-top'])"));

	}
}
