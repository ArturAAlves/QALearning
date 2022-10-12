package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage {

	WebDriver driver;

	TestContext testContext;

	public HomePage(TestContext context) {
		testContext = context;

	}

	@Given("user is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		testContext.landingPageProductName = "treste";

		// Write code here that turns the phrase above into concrete actions
		System.out.println(testContext.landingPageProductName);
	}

	@When("user quicksearch {string} , should get {string}")
	public void user_quicksearch_should_get(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("hello");
	}

}
