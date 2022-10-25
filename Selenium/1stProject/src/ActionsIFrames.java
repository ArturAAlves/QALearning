import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsIFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.es/ref=ap_frn_logo");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("sp-cc-accept")).click();
		
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='nav-link-accountList'])[1]")));
		
//		Thread.sleep(1);
		Actions a = new Actions(driver);
		WebElement tab = driver.findElement(By.xpath("(//a[@id='nav-link-accountList'])[1]"));
		a.moveToElement(tab).build().perform();
		a.moveToElement(tab).build().perform();

		
	}

}
