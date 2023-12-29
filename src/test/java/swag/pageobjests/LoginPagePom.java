package swag.pageobjests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import swag.constants.Constants;

public class LoginPagePom {
	@FindBy(id = "user-name")
	private static WebElement USERNAME;
	@FindBy(id = "password")
	private static WebElement PASSWORD;
	@FindBy(id = "login-button")
	private static WebElement LOGINBTN;
	@FindBy(xpath = "//span[@class='title']")
	private static WebElement LableName;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private static WebElement addtoCart;
	@FindBy(xpath = "//*[text()='1']")
	private static WebElement cartBadge;

	public static WebElement getAddtoCart() {
		return addtoCart;
	}

	public static WebElement getCartBadge() {
		return cartBadge;
	}

	public static WebElement getUSERNAME() {
		return USERNAME;
	}

	public static WebElement getPASSWORD() {
		return PASSWORD;
	}

	public static WebElement getLOGINBTN() {
		return LOGINBTN;
	}

	public static WebElement getLableName() {
		return LableName;
	}

	public static void enterUsername() {
		USERNAME.sendKeys(Constants.Username);
	}

	public static void enterPassword() {
		PASSWORD.sendKeys(Constants.Password);
	}

	public static void clickLoginBtn() {
		LOGINBTN.click();
	}

}
