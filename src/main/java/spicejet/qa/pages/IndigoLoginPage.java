package spicejet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet.qa.base.IndigoTestBase;

public class IndigoLoginPage extends IndigoTestBase{
	
	//PageFactory - Object Repository:
	@FindBy(id="ctl00_HyperLinkLogin")
	WebElement login;
	
	//Initializing Page Objects:
	public IndigoLoginPage(){
		PageFactory.initElements(driverindigo, this);
		}
	
	//Actions:
	
	public String validatePageTitle(){
		
		String title = driverindigo.getTitle();
		return title;
	}
	
	
	   

}
