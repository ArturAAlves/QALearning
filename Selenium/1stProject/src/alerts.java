import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys("test");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(500);
		driver.switchTo().alert();
		driver.switchTo().alert().accept();
		WebElement toSelect = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1"));
		Select toDropdown = new Select(toSelect);
		toDropdown.selectByIndex(5);
	}

}
