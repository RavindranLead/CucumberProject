package swag.pageobjests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutReviewPom {
	@FindBy(xpath = "//span[text()='Checkout: Overview']")
	private static WebElement CheckoutOverviewTitle;
	@FindBy(xpath = "//div[text()='SauceCard #31337']")
	private static WebElement PaymentCardInfo;
	@FindBy(xpath = "//button[@id='cancel']")
	private static WebElement Cancelbtn;
	@FindBy(xpath = "//button[@id='finish']")
	private static WebElement FinishBtn;
	public static WebElement getCheckoutOverviewTitle() {
		return CheckoutOverviewTitle;
	}
	public static WebElement getPaymentCardInfo() {
		return PaymentCardInfo;
	}
	public static WebElement getCancelbtn() {
		return Cancelbtn;
	}
	public static WebElement getFinishBtn() {
		return FinishBtn;
	}
	
	
	
	
}	


