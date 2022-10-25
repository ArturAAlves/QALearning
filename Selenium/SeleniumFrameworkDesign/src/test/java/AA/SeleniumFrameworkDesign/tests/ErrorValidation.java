package AA.SeleniumFrameworkDesign.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AA.SeleniumFrameworkDesign.LandingPage;
import AA.SeleniumFrameworkDesign.tests.TestComponents.BaseTest;
import AA.SeleniumFrameworkDesign.tests.TestComponents.Retry;

public class ErrorValidation extends BaseTest {

	@Test(groups = { "ErrorHandling" }, retryAnalyzer = Retry.class)
	public void LoginValidationIsWrong() throws IOException, InterruptedException {
		String email = "arturdoalves@gmail.com";
		String password = "Sapo78978!";
		LandingPage landingPage = launchApplication();
		landingPage.login(email, password);
		Thread.sleep(1000);
		System.out.println(landingPage.getErrorMessage());
		Assert.assertNotEquals("Incorrect email or password.", landingPage.getErrorMessage());
		driver.quit();
	}

	@Test(groups = { "ErrorHandling" }, retryAnalyzer = Retry.class)
	public void LoginValidationIsTrue() throws IOException, InterruptedException {
		String email = "arturdoalves@gmail.com";
		String password = "Sapo789789!";
		LandingPage landingPage = launchApplication();
		landingPage.login(email, password);
		Thread.sleep(1000);
		System.out.println(landingPage.getErrorMessage());
		Assert.assertNotEquals("Incorrect email or password.", landingPage.getErrorMessage());
		driver.quit();
	}

}
