package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import swag.pageobjests.CartPagePOM;
import swag.pageobjests.CheckoutCompletePagePom;
import swag.pageobjests.CheckoutInfoPage;
import swag.pageobjests.CheckoutReviewPom;
import swag.pageobjests.HomePagePom;
import swag.pageobjests.LoginPagePom;
import swag.webdrivermanager.DriverManager;

public class SanityFlowStepDef {

	@Given("User is entered to the application")
	public void userIsEnteredToTheApplication() {
		DriverManager.getDriver().get("https://www.saucedemo.com/");

	}

	@Given("User is login to the application with valid credentials")
	public void userIsLoginToTheApplicationWithValidCredentials() {
		LoginPagePom.enterUsername();
		LoginPagePom.enterPassword();
		LoginPagePom.clickLoginBtn();

	}

	@Given("User is add the product in the cart and clicked the cart badge")
	public void userIsAddTheProductInTheCartAndClickedTheCartBadge() {
		HomePagePom.getJacket().click();
		HomePagePom.getCartBadge().click();

	}

	@Given("User is clicked the checkout button in the your cart page")
	public void userIsClickedTheCheckoutButtonInTheYourCartPage() {
		CartPagePOM.getCheckOutBtn().click();

	}

	@Given("User is entered the check out information and clicked the continue button")
	public void userIsEnteredTheCheckOutInformationAndClickedTheContinueButton() {
		CheckoutInfoPage.getFirstName().sendKeys("ravindrann");
		CheckoutInfoPage.getLastName().sendKeys("messi");
		CheckoutInfoPage.getPostalCode().sendKeys("987657");
		CheckoutInfoPage.getContinueBtn().click();

	}

	@Given("user is verifyin the payment card type and clicked the finsh button")
	public void userIsVerifyinThePaymentCardTypeAndClickedTheFinshButton() {
		String payment = CheckoutReviewPom.getPaymentCardInfo().getText();
		Assert.assertEquals("SauceCard #31337", payment);
		CheckoutReviewPom.getFinishBtn().click();
	}

	@Then("user can see the order success message")
	public void userCanSeeTheOrderSuccessMessage() {
		String title = CheckoutCompletePagePom.getCheckoutCompleteTitle().getText();
		if (title.equals("Checkout: Complete!")) {
			System.out.println("Title is correct");

		} else {
			System.out.println("Title is incorrect");
		}

		String ordersuccess = CheckoutCompletePagePom.getOrderSuccessMsg().getText();
		System.out.println(ordersuccess);

	}

}
