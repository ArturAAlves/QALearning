package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.TestContext;

public class CartPage {

	private WebDriver driver;
//	private String cartUrl;

	public CartPage(WebDriver driver) {
		this.driver = driver;

	}

//	public CartPage(TestContext context) {
//		TestContext testContext = context;
//		cartUrl = testContext.testBase.cartPageUrl;
//	}

	By productName = By.xpath("(//p[@class='product-name'])[1]");
	By productQuantity = By.xpath("(//p[@class='quantity'])[1]");
	By placeOrderButton = By.xpath("(//button[normalize-space()='Place Order'])[1]");
	By applyButton = By.xpath("(//button[normalize-space()='Apply'])[1]");

	public String getCurrentUrl() throws InterruptedException {
		return driver.getCurrentUrl();
	}

	public WebElement productQuantity() {
		return driver.findElement(productQuantity);
	}

	public WebElement placeOrderButton() {
		return driver.findElement(placeOrderButton);
	}

	public WebElement applyButton() {
		return driver.findElement(applyButton);
	}



}
