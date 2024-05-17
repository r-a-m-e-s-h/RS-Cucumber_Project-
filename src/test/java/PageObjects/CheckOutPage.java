package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	WebDriver driver;
	
	public CheckOutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Cart']")
	WebElement cartBtn;
	
	@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")
	WebElement checkOutBtn;
	
	@FindBy(xpath="//button[@class='promoBtn']")
	WebElement promoBtn;
	
	@FindBy(xpath="//button[text()='Place Order']")
	WebElement placeOrderBtn;
	

	
	public void checkOutItem()
	{
		cartBtn.click();
		checkOutBtn.click();
	}
	public Boolean verifyPromoBtn()
	{
		return promoBtn.isDisplayed();	
	}
	public Boolean verifyplaceOrderBtn()
	{
		return placeOrderBtn.isDisplayed();
		
	}
	
	

}
