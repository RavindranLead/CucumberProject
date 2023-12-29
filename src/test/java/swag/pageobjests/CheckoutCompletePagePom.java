package swag.pageobjests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePagePom {
	
	@FindBy(xpath = "//span[text()='Checkout: Complete!']")
	private static WebElement CheckoutCompleteTitle;
	@FindBy(xpath = "//h2[text()='Thank you for your order!']")
	private static WebElement OrderSuccessMsg;
	@FindBy(xpath = "//button[@ID='back-to-products']")
	private static WebElement BackToProdBtn;
	public static WebElement getCheckoutCompleteTitle() {
		return CheckoutCompleteTitle;
	}
	public static WebElement getOrderSuccessMsg() {
		return OrderSuccessMsg;
	}
	public static WebElement getBackToProdBtn() {
		return BackToProdBtn;
	}

}
