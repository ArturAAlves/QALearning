package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class HomePageStep {

	TestContext testContext;
	WebDriver driver;

	public HomePageStep(TestContext context) {
		testContext = context;

	}

	@Given("user is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() throws IOException {
		testContext.contextSetup();
		testContext.pageObjectManager.getHomePage();
		String currentUrl = testContext.pageObjectManager.homePage.driver.getCurrentUrl();
		currentUrl.contains("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	@When("^user quicksearch (.+) , should get tomato$")
	public void user_quicksearch_should_get_tomato(String name) throws Throwable {
		System.out.println(name);

	}

	@When("user quicksearch {string}, should get tomato")
	public void user_quicksearch(String name) throws Throwable {

	}

	@When("user adds {int} {string} by clicking + button, then clicks add to cart button")
	public void user_adds_by_clicking_button_then_clicks_add_to_cart_button(Integer int1, String string)
			throws InterruptedException {
		driver = testContext.pageObjectManager.homePage.driver;
		Thread.sleep(1000);
		WebElement plusButton = driver
				.findElement(By.xpath("//h4[normalize-space()='Brocolli - 1 Kg']/following-sibling::div[1]/a[2]"));
		plusButton.click();
		plusButton.click();

		WebElement addTocartButton = driver
				.findElement(By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])[1]"));
		addTocartButton.click();
	}

	@When("user press cart icon and click proceed to checkout button")
	public void user_press_cart_icon_and_click_proceed_to_checkout_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("(//img[@alt='Cart'])[1]")).click();
		driver.findElement(By.xpath("(//p[@class='product-name'][normalize-space()='Brocolli - 1 Kg'])[1]")).getText();
		driver.findElement(By.xpath("(//button[normalize-space()='PROCEED TO CHECKOUT'])[1]")).click();
	}

}
