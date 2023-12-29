package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import orange.commonUtils.CommonUtilities;
import swag.constants.Constants;
import swag.pageobjests.HomePagePom;
import swag.pageobjests.LoginPagePom;
import swag.webdrivermanager.DriverManager;

public class PriceLowToHighStepDef {
	@Given("User lauches the Application")
	public void user_lauches_the_application() {
		DriverManager.getDriver().get(Constants.URL);

	}

	@Given("User enters the {string} and {string}")
	public void user_enters_the_and(String uname, String pass) throws IOException {
		try {
			LoginPagePom.enterUsername();
			LoginPagePom.enterPassword();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Given("User Clicks the login button")
	public void user_clicks_the_login_button() throws IOException {
		try {
			LoginPagePom.clickLoginBtn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}

	}

	@Given("user selects the price low to high dropdown")
	public void user_selects_the_price_low_to_high_dropdown() {
		try {
			Select s = new Select(HomePagePom.getDropdown());
			s.selectByVisibleText("Price (low to high)");
		} catch (Exception e) {
			e.printStackTrace();
			
					
		}
		WebElement oniese = HomePagePom.getOniese();
		String text = oniese.getText();
		if (text.equals("Sauce Labs Onesie")) {
			System.err.println("Your product is visible");

		} else {
			System.err.println("Your product is not  visible");
		}

	}

	@Then("verify the first low price product {string}")
	public void verify_the_first_low_price_product(String string) {

	}

}
