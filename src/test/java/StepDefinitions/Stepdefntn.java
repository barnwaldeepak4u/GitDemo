package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdefntn {
	
	@Given("^User is on Netbanking landing page$")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@When("^user logins into application with user name \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logins_into_application_with_user_name_something_and_password_something(String strArg1, String strArg2) {
		
		System.out.println(strArg1);
		System.out.println(strArg2);
	}
        
	@Then("^Home page is populated$")
	public void home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	@And("^cards are displayed$")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

}
