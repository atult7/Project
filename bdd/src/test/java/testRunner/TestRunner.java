package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/UserReg.feature",
		glue={"stepDefinitions"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","json:target/JUnitReports/report.json"}
		)
public class TestRunner {
	

}


