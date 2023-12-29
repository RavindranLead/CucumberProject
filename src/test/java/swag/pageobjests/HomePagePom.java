package swag.pageobjests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePom {
	@FindBy(xpath = "//select[@class='product_sort_container']")
	private static WebElement dropdown;
	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
	private static WebElement Oniese;

	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	private static WebElement backPack;
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
	private static WebElement jacket;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private static WebElement backPackCartBtn;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
	private static WebElement onieseCartBtn;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private static WebElement jacketCartBtn;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private static WebElement cartBadge;

	public static WebElement getBackPack() {
		return backPack;
	}

	public static WebElement getJacket() {
		return jacket;
	}

	public static WebElement getBackPackCartBtn() {
		return backPackCartBtn;
	}

	public static WebElement getOnieseCartBtn() {
		return onieseCartBtn;
	}

	public static WebElement getJacketCartBtn() {
		return jacketCartBtn;
	}

	public static WebElement getCartBadge() {
		return cartBadge;
	}

	public static WebElement getDropdown() {
		return dropdown;
	}

	public static WebElement getOniese() {
		return Oniese;
	}

}
