import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxExercise {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement checkboxOne = driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]"));
		Thread.sleep(100);
		checkboxOne.click();
		Thread.sleep(100);
		checkboxOne.click();
		Thread.sleep(100);
		if (checkboxOne.isSelected() == false) {
			System.out.println("is Unselected");
		}
		System.out.println("the number of checkboxes is " + driver.findElements(By.xpath("//input[@type='checkbox']")).size() +".");
		
		driver.close();
	}
}
