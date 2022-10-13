package stepDefinitions;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.TestContext;
import io.cucumber.java.en.Then;

public class CartPageStep {

	TestContext testContext;
	WebDriver driver;

	public CartPageStep(TestContext context) {
		testContext = context;
		driver = testContext.pageObjectManager.driver;
	}

	@Then("user should be in the cart page, and should have a set of {int} {string}")
	public void user_should_be_in_the_cart_page_and_should_have_a_set_of(Integer int1, String string)
			throws InterruptedException {
		Thread.sleep(500);
		WebElement applyButton = driver.findElement(By.xpath("(//button[normalize-space()='Apply'])[1]"));
		applyButton.click();
	}

	@Then("should see Apply button and Place Order button displaying")
	public void should_see_apply_button_and_place_order_button_displaying() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("user will click Place Order button and move to choose country page")
	public void user_will_click_place_order_button_and_move_to_choose_country_page() {
		// Write code here that turns the phrase above into concrete actions

	}

}
