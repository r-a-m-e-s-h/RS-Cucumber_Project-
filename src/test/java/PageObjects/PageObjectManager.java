package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {

	public WebDriver driver;
	public LandingPage lp;
	public OfferPage op;
	public CheckOutPage cop;

	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LandingPage getLandingPage()
	{
		lp = new LandingPage(driver);
		return lp;
	}

	public OfferPage getOfferPage()
	{
		op = new OfferPage(driver);
		return op;
	}
	public CheckOutPage getCheckoutPage()
	{
		cop = new CheckOutPage(driver);
		return cop;
	}
}
