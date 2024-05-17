package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver driver;
	
	

//public void  WebDriverManager()
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//Resource//config.properties");
		
		Properties properties = new Properties();
		
		properties.load(fis);
		
		String baseURL = properties.getProperty("URL");
		String browserName_cp= properties.getProperty("Browser");
		String browserName_maven = System.getProperty("Browser");
		
		//ternary operation
		// result = condition ? value1 : value2
		
		String browserName = browserName_maven!=null ? browserName_maven : browserName_cp;
		
		if(driver==null)
		{
			if(browserName.equalsIgnoreCase("chrome"))
			{
			driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				driver = new FirefoxDriver();
			}
			else 
			{
				driver = new EdgeDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(baseURL);
		}
		return driver;
	}

}
