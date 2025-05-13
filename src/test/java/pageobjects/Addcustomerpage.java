package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.Waithelper;

public class Addcustomerpage {

public WebDriver ldriver;
Waithelper waithelper;
	
	
	//constructor
	 public Addcustomerpage(WebDriver rdriver) {
	 
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		//waithelper = new Waithelper(rdriver);
	}
	
	
	//xpath
	 //actionmethods
	 
	 
	 public String getPageTitle() {
		return ldriver.getTitle();
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	 }
	
	
	
	
	

