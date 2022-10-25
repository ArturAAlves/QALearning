import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assaignment6_checkBoxCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "http://qaclickacademy.com/practice.php";
		driver.get(url);

		String value = "option2";

		List<WebElement> checkBox = driver.findElements(By.xpath("//div[@id='checkbox-example']//input"));

		for (WebElement check : checkBox) {
			if (check.getAttribute("value").contentEquals(value)) {
				check.click();

			}
		}

		Select selectBox = new Select(driver.findElement(By.id("dropdown-class-example")));
		selectBox.selectByValue(value);

		driver.findElement(By.id("name")).sendKeys(value);
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert();
		driver.switchTo().alert().accept();
		System.out.println("yurra");

	}

}
