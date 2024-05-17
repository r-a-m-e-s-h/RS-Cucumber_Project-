package Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextSetUp {
	
	public WebDriver driver;
	
	public String LandingPageproductName;
	
	public GenericUtils genericUtils;
	
	public PageObjectManager pageObjectManager;
	
	public TestBase testBase;
	
	public TestContextSetUp() throws IOException
	{
		
		testBase = new TestBase();
		genericUtils = new GenericUtils(testBase.WebDriverManager());
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		
	}
	

}
