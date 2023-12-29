package swag.pageobjests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutInfoPage {

	@FindBy(xpath = "//span[text()='Checkout: Your Information']")
	private static WebElement checkoutInfoTitle;
	@FindBy(xpath = "//input[@id='first-name']")
	private static WebElement firstName;
	@FindBy(xpath = "//input[@id='last-name']")
	private static WebElement lastName;
	@FindBy(xpath = "//input[@id='postal-code']")
	private static WebElement postalCode;
	@FindBy(xpath = "//input[@id='continue']")
	private static WebElement continueBtn;
	@FindBy(xpath = "//button[@id='cancel']")
	private static WebElement cancelBtn;

	public static WebElement getCheckoutInfoTitle() {
		return checkoutInfoTitle;
	}

	public static WebElement getFirstName() {
		return firstName;
	}

	public static WebElement getLastName() {
		return lastName;
	}

	public static WebElement getPostalCode() {
		return postalCode;
	}

	public static WebElement getContinueBtn() {
		return continueBtn;
	}

	public static WebElement getCancelBtn() {
		return cancelBtn;
	}

}
