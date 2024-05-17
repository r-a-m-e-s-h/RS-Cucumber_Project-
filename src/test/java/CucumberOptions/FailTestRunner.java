package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="@target/failed_Scenarios.txt",
		glue="stepDefinitions",
		monochrome=true,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)
public class FailTestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}


//dryRun = true,
// tags="@Smoke and @Regression",
// tags="@Smoke or @Regression",
// tags="not @Regression"
//plugin={"pretty","html:target/cucumberReport.html",}
//com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter: