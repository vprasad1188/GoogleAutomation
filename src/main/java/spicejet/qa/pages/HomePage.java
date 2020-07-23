package spicejet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import spicejet.qa.base.TestBase;

public class HomePage extends TestBase{	
	
	
	@FindBy(xpath="//li[@class='profile-login slt-profile-login']//i[@class='icon-arrow']")
	WebElement iconarrow;
	
	

}
