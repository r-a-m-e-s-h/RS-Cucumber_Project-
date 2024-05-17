package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferPage {
	
	public WebDriver driver;
	
	public OfferPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='search-field']")
	WebElement searchBar;
	
	@FindBy(xpath="//table[@class='table table-bordered']//tr/td[1]")
	WebElement productName;
	
	public void searchProduct(String txt)
	{
		searchBar.sendKeys(txt);
	}
	public String getProductName()
	{
		return productName.getText();
	}

}
