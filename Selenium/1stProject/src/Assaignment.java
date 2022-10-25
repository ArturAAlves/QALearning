import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assaignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]//span[2]")).click();
		driver.findElement(By.id("okayBtn")).click();


		WebElement staticDropDown = driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
		Select dropDown = new Select(staticDropDown);
		dropDown.selectByValue("consult");

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-info']")));
		driver.manage().window().maximize();

		List<WebElement> addCartBtns = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for (WebElement addCartBtn : addCartBtns) {
			addCartBtn.click();
		}

		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		driver.findElement(By.xpath("//label[@for='checkbox2'] ")).click();
		driver.findElement(By.id("country")).sendKeys("Portugal");
		
		driver.findElement(By.xpath("(//input[@value='Purchase'])[1]")).click();
		
		

	}

}
