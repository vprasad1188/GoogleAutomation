package spicejet.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import spicejet.qa.base.IndigoTestBase;
import spicejet.qa.pages.IndigoLoginPage;

public class IndigoLoginPageTest extends IndigoTestBase{
	
	IndigoLoginPage indigologinPage;
	
	public IndigoLoginPageTest(){
		super(); //Calling super class or parent class i.e. TestBase class constructor
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		indigologinPage = new IndigoLoginPage();
	}
	
	@Test  //TestCase1
	public void loginPageTitleTest(){
		String title = indigologinPage.validatePageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Book Domestic & International Flights at Lowest Airfare - IndiGo");
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driverindigo.quit();
	}
    

}
