package hooks;

import java.time.Duration;

import org.junit.Ignore;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import orange.commonUtils.CommonUtilities;
import swag.constants.Constants;
import swag.pageobjests.LoginPagePom;
import swag.webdrivermanager.DriverManager;

public class Hooks {
	public static WebDriver driver;

	@Before(order = 0)
	public void beforeScenario() {
		try {
			CommonUtilities commonUtilities = new CommonUtilities();
			commonUtilities.loadProperties();
			if (DriverManager.getDriver() == null) {
				DriverManager.lauchBrowser();
				CommonUtilities.initWebElements();
				DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				DriverManager.getDriver().manage().window().maximize();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	//	@Before(order = 2)
	//	public void setup() {
	//		DriverManager.getDriver().get(Constants.URL);
	//		LoginPagePom.enterUsername();
	//		LoginPagePom.enterPassword();
	//		LoginPagePom.clickLoginBtn();
	//
	//	}

	@After(order = 0)
	public static void attachScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshottaken = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshottaken, "image/png", "errormessage");
		}

	}

	//	@Before(order = 1)
	//	public void beforeScenario(Scenario scenario) {
	//		System.out.println("Scenario is going to start");
	//
	//	}

	@After(order = 1)
	public void teardown() {
		//		DriverManager.getDriver().quit();

	}

	// @BeforeStep
	// public void beforeStep() {
	// System.out.println("Step Execution is stared");
	//
	// }
	//
	// @AfterStep
	// public void afterStep() {
	// System.out.println("Step Execution is ended");
	// }

}
