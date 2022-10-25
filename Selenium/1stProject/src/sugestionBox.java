import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class sugestionBox {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(300);

		List<WebElement> options = driver.findElements(By.xpath("//li [@class= 'ui-menu-item'] //a"));

		for (WebElement option : options) {
			if (option.getText().contentEquals("India")) {
				option.click();
				break;
			}

		}

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		boolean verify = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected();
		Assert.assertTrue(verify);
		Assert.assertEquals(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected(), true);
		
		
		
//		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());

		System.out.println("hekki");
//		driver.close();

	}
}
