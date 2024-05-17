package stepDefinitions;

import org.testng.Assert;

import PageObjects.CheckOutPage;
import Utilities.TestContextSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckoutPageStepDefinition {

	TestContextSetUp testContextSetUp;
	CheckOutPage cop;

	public CheckoutPageStepDefinition(TestContextSetUp testContextSetUp)
	{
		this.testContextSetUp = testContextSetUp;
		 this.cop = testContextSetUp.pageObjectManager.getCheckoutPage();
	}

	
	@Then("^User proceed to Checkout and validate the (.+) items in the checkout page$")
	public void User_proceed_to_Checkout_and_validate_the_items_in_the_checkout_page(String vegetableName) 
	{
		cop.checkOutItem();
		
	}

	@And("^Verify User has ability to enter promocode and place the order$")
	public void Verify_User_has_ability_to_enter_promocode_and_place_the_order()
	{
		
		Assert.assertTrue(cop.verifyPromoBtn());
		Assert.assertTrue(cop.verifyplaceOrderBtn());
	}

}
