package stepDefinitions;

import org.testng.Assert;
import cucumber.TestContext;
import io.cucumber.java.en.Then;

public class CartPageStep {

	TestContext testContext;
	String cartUrl;
	String selectCountryUrl;

	public CartPageStep(TestContext context) throws InterruptedException {
		testContext = context;
		testContext.pageObjectManager.cartPage();
		cartUrl = testContext.testBase.cartPageUrl;
		selectCountryUrl = testContext.testBase.selectCountryPageUrl;
		Thread.sleep(1000);
	}

	@Then("user should be in the cart page, and should have a set of {string} {string}")
	public void user_should_be_in_the_cart_page_and_should_have_a_set_of(String numberOfProducts, String product)
			throws InterruptedException {
		Assert.assertEquals(cartUrl, testContext.pageObjectManager.cartPage.getCurrentUrl());
		Assert.assertEquals(numberOfProducts, testContext.pageObjectManager.cartPage.productQuantity().getText());

	}

	@Then("should see Apply button and Place Order button displaying")
	public void should_see_apply_button_and_place_order_button_displaying() {
		Assert.assertNotNull(testContext.pageObjectManager.cartPage.applyButton());
		Assert.assertNotNull(testContext.pageObjectManager.cartPage.placeOrderButton());

	}

	@Then("user will click Place Order button and move to choose country page")
	public void user_will_click_place_order_button_and_move_to_choose_country_page() throws InterruptedException {
		testContext.pageObjectManager.cartPage.placeOrderButton().click();
		Assert.assertEquals(selectCountryUrl, testContext.pageObjectManager.cartPage.getCurrentUrl());
	}

}
