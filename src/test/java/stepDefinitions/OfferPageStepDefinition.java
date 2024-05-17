package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OfferPage;
import Utilities.GenericUtils;
import Utilities.TestContextSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.bytebuddy.description.type.TypeList.Generic;



public class OfferPageStepDefinition {

	
	public String offerPageproductName;
	
	TestContextSetUp testContextSetUp;
	OfferPage op;

	public OfferPageStepDefinition(TestContextSetUp testContextSetUp)
	{
		this.testContextSetUp=testContextSetUp;
		this.op=testContextSetUp.pageObjectManager.getOfferPage();
	}

	@Then("^User search the product in the offers page with shortName (.+) to check if exist$")
	public void user_search_the_product_in_the_offers_page_with_short_name_to_check_if_exist(String vegetableName) throws InterruptedException
	{
		//driver.findElement(By.xpath("//a[text()='Top Deals']")).click();

		switchToOffersPage();

		//OfferPage op = testContextSetUp.pageObjectManager.getOfferPage();
		op.searchProduct(vegetableName);
		Thread.sleep(3000);
		op.getProductName();
		offerPageproductName = op.getProductName();
		System.out.println("Product name in the Offers page is = "+offerPageproductName);

		/*
		 * WebElement offerPagesearchBar =
		 * driver.findElement(By.xpath("//input[@id='search-field']"));
		 * offerPagesearchBar.sendKeys(vegetableName); Thread.sleep(3000);
		 * offerPageproductName = driver.findElement(By.
		 * xpath("//table[@class='table table-bordered']//tr/td[1]")).getText();
		 * System.out.println(offerPageproductName);
		 */
	}
	public void switchToOffersPage()
	{
		/*
		 * Set<String> allWindows = driver.getWindowHandles(); Iterator<String> i1
		 * =allWindows.iterator(); String parentWindow = i1.next(); String childWindow =
		 * i1.next();
		 * 
		 * driver.switchTo().window(childWindow);
		 */


		LandingPage lp = testContextSetUp.pageObjectManager.getLandingPage();
		lp.clickTopDealsLink();

		testContextSetUp.genericUtils.switchToChild();
	}
	@And("check both both the productNames are same and close the browser")
	public void check_both_both_the_product_names_are_same_and_close_the_browser() 
	{
		Assert.assertEquals(offerPageproductName, testContextSetUp.LandingPageproductName);
		System.out.println("---------- Both names are same ----------");
		//driver.quit();
	}


}
