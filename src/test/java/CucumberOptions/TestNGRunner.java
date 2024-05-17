package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/Features",
		glue="stepDefinitions",
		monochrome=true,
		dryRun=false,
		tags="@PlaceOrder or @SearchProduct",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_Scenarios.txt"}
		//com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:
		)
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
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