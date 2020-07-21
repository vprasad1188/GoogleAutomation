package spicejet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet.qa.base.IndigoTestBase;

public class IndigoLoginPage extends IndigoTestBase{
	
	//PageFactory - Object Repository:
	@FindBy(linkText="Login")
	WebElement login;
	
	@FindBy(xpath="//input[@id='memberCC']")
	WebElement countrycode;
	
	@FindBy(xpath="//input[@id='memberId']")
	WebElement mobnum;
	
	@FindBy(xpath="//input[@id='mobilePass']")
	WebElement pwd;
	
	@FindBy(xpath="//span[@class='buttonText']")
	WebElement loginbutton;
	
	//Initializing Page Objects:
	public IndigoLoginPage(){
		System.out.println("inside loginpage constructor");
		PageFactory.initElements(driverindigo, this);
		}
	
	//Actions:
	
	public String validatePageTitle(){		
		String title = driverindigo.getTitle();
		return title;
	}
	

	
	
	
	   

}
