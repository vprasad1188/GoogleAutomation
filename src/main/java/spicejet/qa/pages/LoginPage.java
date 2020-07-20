package spicejet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//PageFactory - Object Repository:
	@FindBy(id="ctl00_HyperLinkLogin")
	WebElement login;
	
	//Initializing Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
		}
	
	//Actions:
	
	public String validatePageTitle(){
		
		String title = driver.getTitle();
		return title;
	}
	
	
	   

}
