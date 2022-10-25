import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartManage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthur\\Desktop\\QA\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String[] productNames = { "Cucumber", "Cauliflower", "Beetroot" };
		addItems(driver, productNames);

		// cupon rahulshettyacademy

		driver.findElement(By.cssSelector(".cart-icon img")).click();

		driver.findElement(By.xpath("(//button[contains(text(), 'PROCEED TO CHECKOUT')])")).click();

		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		String promoOn = w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo"))).getText();

		if (promoOn.contentEquals("Code applied ..!")) {
			driver.findElement(By.xpath("//button[contains(text(), 'Place Order')]")).click();
		}else {
			System.out.println("u gay");
		}

	}

	public static void addItems(WebDriver driver, String[] productNames) {
		List<String> productNameList = Arrays.asList(productNames);
		List<WebElement> producstName = driver.findElements(By.cssSelector("h4.product-name"));

		// TODO Auto-generated method stub
		for (String productNameListItem : productNameList) {
			for (int i = 0; i < producstName.size(); i++) {
				String product = producstName.get(i).getText();
				if (product.contains(productNameListItem)) {
					driver.findElement(By.xpath("(//div[@class='product-action'])[" + i + "] //button")).click();
					break;
				}
			}
		}

	}

}
