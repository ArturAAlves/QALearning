import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise");

		
		// from select
//		WebElement fromSelect = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
//		Select fromDropdown = new Select(fromSelect);
//		fromDropdown.selectByIndex(3);
		
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		//select option by xpath 
		driver.findElement(By.xpath("//option[contains(text(),'Ahmedabad (AMD)')]")).click();
		// ----

		// to select
		WebElement toSelect = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1"));
		Select toDropdown = new Select(toSelect);
		toDropdown.selectByIndex(5);
		// ----

		// currency
		WebElement staticDropDown = driver
				.findElement(By.xpath("//select[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));
		Select dropDown = new Select(staticDropDown);
		dropDown.selectByVisibleText("USD");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		// ----

		// passengers slection
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for (int i = 1; i < 5; i++) {
			Thread.sleep(200);
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		// ----

		driver.findElement(By.id("hrefIncChd")).click();

//		if (dropDown.getFirstSelectedOption().getText() == "AED") {
//			System.out.println("succsees" + " " + dropDown.getFirstSelectedOption().getText().toString());
//		} else {
//			System.out.println("succsees" + " " + dropDown.getFirstSelectedOption().getText().toString());
//			System.out.println("fail");
//		}

//		if (dropDown.getFirstSelectedOption().getText() == "USD") {
//
//			driver.quit();
//		} else {
//			System.out.println("you gay");
//		}
//			Thread.sleep(2000);

		Thread.sleep(2000);
//		driver.close();
	}

}
