package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QuickBuyPage {
	WebDriver driver;
	TestContext testContext;

	public QuickBuyPage(TestContext context) {
		testContext = context;

	}

	@When("user access top deals page and quicksearch {string} , should get {string}")
	public void user_access_top_deals_page_and_quicksearch_should_get(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("hello");
	}

	@Then("both should be tomato")
	public void both_should_be_tomato() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(testContext.landingPageProductName);
	}
}
