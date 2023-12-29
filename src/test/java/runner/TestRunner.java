package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeatureFiles",
//				"FeatureFiles/EndToEndOrderFlow.feature"},
		glue={"stepDefinitions","hooks"},
		monochrome = true,
		dryRun = !true,
		stepNotifications = true,
		publish = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//		tags = "@Regression or @Simple "
		)
public class TestRunner{

}
