package spicejet.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet.qa.base.IndigoTestBase;
import spicejet.qa.util.TestUtil;

public class IndigoLoginPage extends IndigoTestBase{
	
	//PageFactory - Object Repository:
	@FindBy(linkText="Login")
	WebElement login;
	
	@FindBy(xpath="//input[@id='memberCC']")
	WebElement countrycode;
	
	@FindBy(xpath="//input[@id='memberId']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='mobilePass']")
	WebElement pwd;
	
	@FindBy(xpath="//span[@class='buttonText']")
	WebElement loginbutton;
	
	@FindBy(xpath="//i[@class='icon-icHamburger']")
	WebElement homeHamburger;
	
	@FindBy(xpath="//a[@title='Book a Flight']")
	WebElement hamburgerBookFlight;
	
	@FindBy(xpath="//li[@class='profile-login slt-profile-login']//span[@class='avatar']")
	WebElement iconarrow;
	
	@FindBy(xpath="//li[@class='profile-login slt-profile-login']//span[@id='grabText']")
	WebElement userProfilename;
	
	//Initializing Page Objects:
	public IndigoLoginPage(){
		System.out.println("-------Inside loginpage constructor");
		PageFactory.initElements(driverindigo, this);
		}
	
	//Actions:
	
	public String validatePageTitle(){		
		String title = driverindigo.getTitle();
		return title;
	}
	
	public HomePage validateLogin(String user,String pwd){
		login.click();
		countrycode.clear();
		countrycode.sendKeys(propindigo.getProperty("indicc"));
		username.sendKeys(user);
		this.pwd.sendKeys(pwd);
		
		loginbutton.click();
		
		return new HomePage();
	}
	
	public String validateProfileNameLabel(String user,String pwd) throws InterruptedException{
		login.click();
		countrycode.clear();
		countrycode.sendKeys(propindigo.getProperty("indicc"));
		username.sendKeys(user);
		this.pwd.sendKeys(pwd);		
		loginbutton.click();
		//TestUtil.waitForElement(driverindigo,iconarrow);
		//TestUtil.refreshdriver(driver);
		//driverindigo.navigate().refresh(); 
		iconarrow.click();
        Thread.sleep(3000);
		String userProfilelable = userProfilename.getText();		
		return userProfilelable;
	}
	
	
	public FlightSearchWithoutLoginPage validateBookFlightHamburger(){
		homeHamburger.click();
		hamburgerBookFlight.click();
		
		return new FlightSearchWithoutLoginPage();
	}
	
	   

}
