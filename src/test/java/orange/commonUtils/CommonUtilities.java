package orange.commonUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import net.bytebuddy.asm.Advice.Return;
import swag.constants.Constants;
import swag.pageobjests.CartPagePOM;
import swag.pageobjests.CheckoutCompletePagePom;
import swag.pageobjests.CheckoutInfoPage;
import swag.pageobjests.CheckoutReviewPom;
import swag.pageobjests.HomePagePom;
import swag.pageobjests.LoginPagePom;
import swag.webdrivermanager.DriverManager;

public class CommonUtilities {
	static FileReader file = null;

	public void loadProperties() throws IOException {
		FileReader reader = new FileReader("src/test/resources/config.properties");
		Properties properties = new Properties();
		properties.load(reader);

		Constants.URL = properties.getProperty("URL");
		Constants.Username = properties.getProperty("Username");
		Constants.Password = properties.getProperty("Password");
		Constants.ChromeDriverLocation = properties.getProperty("ChromeDriverLocation");
		Constants.Browser = properties.getProperty("Browser");
	}

	public static void initWebElements() {
		PageFactory.initElements(DriverManager.getDriver(), LoginPagePom.class);
		PageFactory.initElements(DriverManager.getDriver(), HomePagePom.class);
		PageFactory.initElements(DriverManager.getDriver(), CartPagePOM.class);
		PageFactory.initElements(DriverManager.getDriver(), CheckoutInfoPage.class);
		PageFactory.initElements(DriverManager.getDriver(), CheckoutReviewPom.class);
		PageFactory.initElements(DriverManager.getDriver(), CheckoutCompletePagePom.class);
		
	}

//	public static void takeScreenshot(String filepathString) throws IOException {
//		
//		TakesScreenshot screenshot = (TakesScreenshot) DriverManager.getDriver();
//		File source = screenshot.getScreenshotAs(OutputType.FILE);
//		File des = new File(filepathString);
//		FileUtils.copyFile(source, des);
//		}
	

}