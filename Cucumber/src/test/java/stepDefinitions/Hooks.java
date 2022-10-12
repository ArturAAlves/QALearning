package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void beforeScenario() {
		System.out.println("This will run before the Scenario");
	}
	
	@Before ("@SmokeTest")
	public void sas() {
		System.out.println("smokeTest only");
	}
	
	

	@After
	public void AfterScenario() {
		System.out.println("This will run after the Scenario");
	}
}
