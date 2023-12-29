package swag.pageobjests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPagePOM {
	@FindBy(xpath = "//span[@class='title']")
	private static WebElement cartTitle;
	@FindBy(xpath = "//button[@id='continue-shopping']")
	private static WebElement continueShoppinBtn;
	@FindBy(xpath = "//button[@id='checkout']")
	private static WebElement checkOutBtn;

	public static WebElement getCartTitle() {
		return cartTitle;
	}

	public static WebElement getContinueShoppinBtn() {
		return continueShoppinBtn;
	}

	public static WebElement getCheckOutBtn() {
		return checkOutBtn;
	}

}
