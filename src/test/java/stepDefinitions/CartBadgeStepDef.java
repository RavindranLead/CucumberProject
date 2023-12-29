package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import swag.constants.Constants;
import swag.pageobjests.LoginPagePom;
import swag.webdrivermanager.DriverManager;

public class CartBadgeStepDef {
	
	@Given("Login to Swaglabs application")
	public void login_to_swaglabs_application() {
		DriverManager.getDriver().get("https://www.saucedemo.com/");
		
	   
	}

	@And("login with correct username and pasword")
	public void login_with_correct_username_and_pasword() {
		LoginPagePom.getUSERNAME().sendKeys(Constants.Username);
		LoginPagePom.getPASSWORD().sendKeys(Constants.Password);
	    LoginPagePom.getLOGINBTN().click();
	}

	@And("move any one of the product into cart")
	public void move_any_one_of_the_product_into_cart() {
		LoginPagePom.getAddtoCart().click();
	    
	}

	@Then("check the cart badge count")
	public void check_the_cart_badge_count() {
	   String badgeCount = LoginPagePom.getCartBadge().getText();
	   System.out.println(badgeCount);
	}

}
