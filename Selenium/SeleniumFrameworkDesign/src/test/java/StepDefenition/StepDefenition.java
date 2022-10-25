package StepDefenition;

import java.io.IOException;

import AA.SeleniumFrameworkDesign.LandingPage;
import AA.SeleniumFrameworkDesign.tests.TestComponents.BaseTest;
import io.cucumber.java.en.Given;

public class StepDefenition extends BaseTest {

	public LandingPage langingPage;

	@Given("I Land on Login Page")
	public void I_Land_on_Login_Page() throws IOException {
		langingPage = launchApplication();
	}

	@Given("^Login with valid email (.+) and password (.+)$")
	public void Login_with_valid_email_and_password(String username, String password) {
		
	}

}
