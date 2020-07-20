package spicejet.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import spicejet.qa.base.TestBase;
import spicejet.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	
	public LoginPageTest(){
		super(); //Calling super class or parent class i.e. TestBase class constructor
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test  //TestCase1
	public void loginPageTitleTest(){
		String title = loginPage.validatePageTitle();
		Assert.assertEquals(title, "SpiceJet");
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
    

}
