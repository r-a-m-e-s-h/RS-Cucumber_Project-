package stepDefinitions;



import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.PageObjectManager;
import Utilities.TestContextSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDefinition {

	//public WebDriver driver;
	//public String LandingPageproductName;
	
	public String offerPageproductName;
	TestContextSetUp testContextSetUp;
	PageObjectManager pageObjectManager;
	LandingPage lp;

	public LandingPageStepDefinition(TestContextSetUp testContextSetUp)
	{
		this.testContextSetUp = testContextSetUp;
		 this.lp=testContextSetUp.pageObjectManager.getLandingPage();
	}

	@Given("user is on GreenKart Landing Page")
	public void user_is_on_green_kart_landing_page() throws IOException {
		//  driver = new ChromeDriver();
		//testContextSetUp.testBase.WebDriverManager(); ## constructor invoked happened initially so driver is initialozed 
		lp.getPageTitle();
	}

	@When("^User Search the product with shortName (.+) and extract the actual name of the product$")
	public void user_search_the_product_with_short_name_and_extract_the_actual_name_of_the_product(String vegetableName) throws InterruptedException {
		/*
		 * WebElement LandingPagesearchBar =
		 * driver.findElement(By.xpath("//input[@type='search']"));
		 * LandingPagesearchBar.sendKeys(vegetableName); Thread.sleep(3000);
		 * LandingPageproductName =
		 * driver.findElement(By.xpath("//h4[@class='product-name']")).getText().split(
		 * "-")[0].trim(); System.out.println(LandingPageproductName);
		 */


		//LandingPage lp = testContextSetUp.pageObjectManager.getLandingPage();
		lp.searchProduct(vegetableName);
		Thread.sleep(3000);
		testContextSetUp.LandingPageproductName=lp.getProductName();
		System.out.println("Product name in the Landing page is = "+testContextSetUp.LandingPageproductName);
		
		

	}

	@And("Added {string} selected items of the product to cart")
	public void added_selected_items_of_the_product_to_cart(String quantity) {
		lp.incrementProductQuantity(Integer.parseInt(quantity));
		lp.addItemTocart();
	}


}
