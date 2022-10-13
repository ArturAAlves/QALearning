package stepDefinitions;

import java.io.IOException;

import cucumber.TestContext;
import io.cucumber.java.After;

public class Hooks {
	TestContext testContext;

	public Hooks(TestContext context) {
		this.testContext = context;
	}

//	@After
//	public void AfterScenario() throws IOException {
//		testContext.testBase.WebDriverManager().close();
//	}
}
