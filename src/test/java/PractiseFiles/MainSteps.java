package PractiseFiles;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {


	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println(" user is on login page ");
	}
	@Given("user is on Sign-up page")
	public void user_is_on_sign_up_page() {
	    System.out.println("user is on Sign-up page");
	}
	@When("user enters the details")
	public void user_enters_the_details(List<String> data) {
	  System.out.println(data.get(0));
	  System.out.println(data.get(1));
	  System.out.println(data.get(2));
	  System.out.println(data.get(3));
	}
	@And("user click on the next Btn")
	public void user_click_on_the_next_btn() {
	    System.out.println("user click on the next Btn");
	    
	}
	
	@When("user enters the credentials username {string} and password as {string}")
	public void user_enters_the_credentials_username_and_password_as(String username, String pwd) {
		System.out.println("User name is : "+username+" Password is : "+pwd);
	}
	@When("^user enters the credentials username (.+) and password as (.+) combination$")
	public void user_enters_the_credentials_username_and_password_as_combination(String username, String pwd) {
		System.out.println("User name for Datadriven testing is  : "+username+" Password is : "+pwd);
	}
	
	@And("user click on the Login Btn")
	public void user_click_on_the_login_btn() {
		System.out.println(" user click on the Login Btn  ");
	}
	@Then("user is on Home Page")
	public void user_is_on_home_page() {
		System.out.println(" user is on Home Page  ");
	}
	
	@Given("clear the database")
	public void clearDataBase() {
		System.out.println("*********************");
		System.out.println("enterthe data need from DB");
		
	}
	@When("launch the browser")
	public void launchBrowser()
	{
		System.out.println("launch the browser");
	}
	@And("hit the URL of Testing site")
	public void hit_HomePage_URL()
	{
		System.out.println("hit the URL of Testing site");
	}
	


}
