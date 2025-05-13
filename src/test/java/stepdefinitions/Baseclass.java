package stepdefinitions;

import java.util.Properties;
import java.util.logging.Logger;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageobjects.Addcustomerpage;
import pageobjects.Loginpage;

public class Baseclass {
	public WebDriver driver;
	public Loginpage lp;
	public Addcustomerpage addcust;
	public static Logger logger;
	public Properties configprop;
	
	
	
	public static String randomstring() {
		String genString =RandomStringUtils.randomAlphabetic(5);
		return (genString);
	}
	
	//common variables and methods seperated into baseclass
	
	//all pageobject elements handled here
	
	//Common page objects

//Utility methods (like generating random data)
	
	//WebDriver driver	Shared across test steps/pages
	//Page Objects	Like LoginPage lp or AddCustomerPage addcust
	//Utility Methods	Random data generators, waits, screenshots
	//Config Readers	Reading from config.properties, etc.
	//Setup/Teardown Methods
	//in pom.xml we can run using maven compiler plugin and run as maven test
	//common utility files
}
