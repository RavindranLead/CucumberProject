package stepDefinitions;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import swag.constants.Constants;
import swag.pageobjests.HomePagePom;
import swag.pageobjests.LoginPagePom;
import swag.webdrivermanager.DriverManager;

public class CartBadgeDef {
	@Given("Login to Swaglabs app")
	public void loginToSwaglabsApp() {
		
	}

	@And("move any of the product into cart")
	public void moveAnyOfTheProductIntoCart() {
		HomePagePom.getBackPack().click();
		HomePagePom.getBackPackCartBtn().click();

	}

	@Then("verify the cart badge count")
	public void verifyTheCartBadgeCount() {
		WebElement cartBadge = HomePagePom.getCartBadge();
		String badgeCount = cartBadge.getText();
		System.out.println(badgeCount);
	}

}
