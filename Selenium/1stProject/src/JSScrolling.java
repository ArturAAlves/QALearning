import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JSScrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement box = driver.findElement(By.className("tableFixHead"));

		Actions action = new Actions(driver);
		js.executeScript("window.scrollBy(200,500)");
		action.clickAndHold(box).build().perform();
		js.executeScript("document.querySelector('.tableFixHead').scroll(0,100)");

	}

}
