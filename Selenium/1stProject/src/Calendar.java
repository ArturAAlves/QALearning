import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://www.path2usa.com/travel-companion/";
		driver.get(url);
		driver.findElement(By.id("ez-accept-all")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("(//input[@id='form-field-travel_comp_date'])[1]")).click();
		Thread.sleep(200);
//		driver.findElement(By.xpath("(//span[@aria-label='August 26, 2022'])[1]")).click();

	}

}
