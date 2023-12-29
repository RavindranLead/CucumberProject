package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import swag.constants.Constants;
import swag.pageobjests.LoginPagePom;
import swag.webdrivermanager.DriverManager;

public class SwagLoginStepDef {
	@Given("User Launch the application")
	public void user_launch_the_application() {
	   DriverManager.getDriver().get(Constants.URL);
	}
	@When("user enters the username")
	public void user_enters_the_username() {
	 
	}

	@When("user enters the password")
	public void user_enters_the_password() {
	    
	}

	@Then("user clicks the login button")
	public void user_clicks_the_login_button() {
	   
	}

}
