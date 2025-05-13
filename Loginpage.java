package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	
public WebDriver driver;
	
	
	//constructor
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	//locators
	
	@FindBy(id= "Email") 
	WebElement txtusername;
	@FindBy(id = "Password") 
	WebElement txtpassword;
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement btnlogin;
	
	
	
	
	
	//actions
	
		public void setusername(String username) {
			
	     txtusername.sendKeys(username);
		}
		
		public void setpassword(String pwd) {
			txtpassword.sendKeys(pwd);

		}
		
		public void clicklogin() {
			btnlogin.click();

		}
		
		
	
	
	
	
	
	
	
}
