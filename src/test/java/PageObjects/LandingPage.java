package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@type='search']")
	WebElement searchBar;

	@FindBy(xpath="//h4[@class='product-name']")
	WebElement productName;

	@FindBy(xpath="//a[text()='Top Deals']")
	WebElement topDealsLink;

	@FindBy(xpath="//button[text()='ADD TO CART']")
	WebElement addToCartBtn;

	@FindBy(xpath="//a[@class='increment']")
	WebElement incrementBtn;

	public void searchProduct(String txt) 
	{
		searchBar.sendKeys(txt);
	}
	public String getProductName()
	{
		return productName.getText().split("-")[0].trim();
	}
	public void clickTopDealsLink()
	{
		topDealsLink.click();
	}
	public void getPageTitle()
	{
		 driver.getTitle();
	}
	public void incrementProductQuantity(int quantity)
	{/*
		 * int i=quantity-1; while(i>0) { incrementBtn.click(); i--; }
		 */
		int i=3;
		for(i=1;i<=2;i++)
		{
			incrementBtn.click();
		}
		
	}
	public void addItemTocart()
	{
		addToCartBtn.click();
	}

}
