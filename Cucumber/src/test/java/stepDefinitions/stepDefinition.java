package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

	@Given("browser chosen is chrome")
	public void browser_chosen_is_chrome() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("choose broser");

	}

	@When("the broser triggers")
	public void the_broser_triggers() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("trigger browser");

	}

	@Then("browser tag is chrome browser")
	public void browser_tag_is_chrome_browser() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Rune after hook , before each test");

	}

	@Given("^user on landing (.+)$")
	public void user_on_landing(String status) throws Throwable {

	}

	@When("^user login with (.+) and (.+)$")
	public void user_login_with_and(String name, String value) throws Throwable {

	}

	@When("^user logged in with dataaa$")
	public void user_logged_in_with_dataaa(DataTable datatable) throws Throwable {

	}

	@Then("^invalid login data$")
	public void invalid_login_data() throws Throwable {

	}

	@And("^some other precondition$")
	public void some_other_precondition() throws Throwable {

	}

	@Given("user on acc page")
	public void user_on_acc_page() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("user logged in with dataaaaa")
	public void user_logged_in_with_dataaaaa() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("sadsa");
	}
}
