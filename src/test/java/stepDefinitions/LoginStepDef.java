package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orange.commonUtils.CommonUtilities;
import swag.constants.Constants;
import swag.pageobjests.LoginPagePom;
import swag.webdrivermanager.DriverManager;

public class LoginStepDef {
	@Given("User launch the Swaglabs application")
	public void user_launch_the_swaglabs_application() {
		DriverManager.getDriver().get(Constants.URL);
	
	}

	@When("User enters the username {string}")
	public void user_enters_the_username(String uname) {
		LoginPagePom.enterUsername();

	}

	@When("User enters the password {string}")
	public void user_enters_the_password(String pass) {
		LoginPagePom.enterPassword();
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		LoginPagePom.clickLoginBtn();
	}
	@Then("verify the lable name of home page")
	public void verifyTheLableNameOfHomePage() {
		String labelName = LoginPagePom.getLableName().getText();
		Assert.assertEquals("Products", labelName);
		System.out.println(labelName);
	 
	}


}
