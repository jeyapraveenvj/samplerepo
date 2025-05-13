package stepdefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Addcustomerpage;
import pageobjects.Loginpage;


public class steps extends Baseclass {

	@Before
	public void setup() throws IOException
	{
		//reading properties
		configprop=new Properties();
		FileInputStream configpropfile=new FileInputStream("config.properties");
		configprop.load(configpropfile);
		
		logger=Logger.getLogger("nopcommerce");
		//PropertyConfigurator.configure("log4j.properties");
	  
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//driver/chromedriver.exe");
	     driver = new ChromeDriver();
	     logger.info("launch browser");
	}
	
	
	
	@Given("user launch is on the login page")
	public void user_launch_is_on_the_login_page() {
		
	  lp = new Loginpage(driver);
	}

	@When("the user opens url {string}")
	public void the_user_opens_url( String url) {
		driver.get(url);
	   
	}
    @BeforeStep
	@When("the user enters email as {string} and password as {string}")
	public void the_user_enters_email_as_and_password_as(String email, String password) {
	   
	   lp.setusername(email);
	   lp.setpassword(password);
	}

	@When("click on login")
	public void click_on_login() {
		lp.clicklogin();
	   
	}

	
	
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
	    addcust = new Addcustomerpage(driver);
	   Assert.assertEquals("Dashboard / nopcommerce administration" , addcust.getPageTitle());
	}

	@When("User click on customers menu")
	public void user_click_on_customers_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on customers menu item")
	public void click_on_customers_menu_item() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enter customer info")
	public void user_enter_customer_info() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on save button")
	public void click_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	
	
	
	
	
	
	
}
