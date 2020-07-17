package spicejet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import spicejet.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//PageFactory - Object Repository:
	@FindBy(id="ctl00_HyperLinkLogin")
	WebElement login;
	
	

}
