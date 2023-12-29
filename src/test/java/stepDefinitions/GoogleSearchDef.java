package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import swag.webdrivermanager.DriverManager;

public class GoogleSearchDef {
	@Given("User launches the chrome website")
	public void user_launches_the_chrome_website() {
		DriverManager.getDriver().get("https://www.google.com");

	}

	@When("user search the {string} in the search bar")
	public void user_search_the_in_the_search_bar(String Oneplus) {
		WebElement searchBox = DriverManager.getDriver().findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchBox.sendKeys(Oneplus);
	}

	@And("user clicks the search button")
	public void user_clicks_the_search_button() {
		DriverManager.getDriver().findElement(By.xpath("(//input[@value='Google Search'])[1]")).click();

	}

	@Then("user can see the Oneplus12 related search results")
	public void user_can_see_the_oneplus12_related_search_results() {
		String oneplusResult = DriverManager.getDriver().findElement(By.xpath("//h3[text()='OnePlus 12']")).getText();
		System.out.println(oneplusResult);
	}


	@Given("user searching the {string} in the search")
	public void user_searching_the_in_the_search(String Iphone) {
		WebElement searchBox = DriverManager.getDriver().findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchBox.sendKeys(Iphone);
	}

	@When("user clicks the search icon")
	public void user_clicks_the_search_icon() {
		DriverManager.getDriver().findElement(By.xpath("(//input[@value='Google Search'])[1]")).click();
	}

	@Then("user can see the Iphone15 related search results")
	public void user_can_see_the_iphone15_related_search_results() {
		String IphoneResults = DriverManager.getDriver().findElement(By.xpath("//span[text()='Apple iPhone 15']")).getText();
		System.out.println(IphoneResults);
	}

	@Given("the use search the {string} in the search bar")
	public void the_use_search_the_in_the_search_bar(String string) {

	}

	@When("user clicks the search option")
	public void user_clicks_the_search_option() {

	}

	@Then("user can see the S23 ultra related search results")
	public void user_can_see_the_s23_ultra_related_search_results() {

	}

}
