package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utilities.TestContextSetUp;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {
	
	TestContextSetUp testContextSetUp;
	
	
	public hooks(TestContextSetUp testContextSetUp)
	{
		this.testContextSetUp = testContextSetUp;
	}
	
	@After
	public void tearDown() throws IOException
	{
		testContextSetUp.testBase.WebDriverManager().quit();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver = testContextSetUp.testBase.WebDriverManager();
		if(scenario.isFailed())
		{
			TakesScreenshot screenshot =(TakesScreenshot)driver;
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			
			byte[] fileCOntent = FileUtils.readFileToByteArray(src);
			scenario.attach(fileCOntent, "image/png", "image");
			
		}
	}

}
/*
 * @Before(" @DataDriven") public void dataDriven() 
 * {
 * System.out.println("************");
 * System.out.println("clear the database for DataDriven testing"); 
 * }
 * 
 * @After public void tearDown() 
 * { System.out.println("close the browser");
 * System.out.println("************"); 
 * }
 */
