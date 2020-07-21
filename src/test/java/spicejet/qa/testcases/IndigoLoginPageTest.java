package spicejet.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import spicejet.qa.base.IndigoTestBase;
import spicejet.qa.pages.IndigoLoginPage;

public class IndigoLoginPageTest extends IndigoTestBase{	
	

	IndigoLoginPage indigologinPage;
	
//	public IndigoLoginPageTest(){
//		super(); //Calling super class or parent class i.e. TestBase class constructor
//		System.out.println("inside loginpagetest constructor");
//	}
	
	@BeforeMethod
	public void setUp(){
		System.out.println("Inside setup");
		initialization();
		System.out.println("setup after initialization");
		indigologinPage = new IndigoLoginPage();
		System.out.println("completed setup");
	}
	
	@Test  //TestCase1
	public void loginPageTitleTest(){
		String title = indigologinPage.validatePageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Book Domestic & International Flights at Lowest Airfare - IndiGo");
	}

	
	
	@AfterMethod
	public void tearDown(){
		System.out.println("inside teardown");
		driverindigo.quit();
	}
    

}
