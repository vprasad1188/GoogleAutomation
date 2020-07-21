package spicejet.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import spicejet.qa.base.IndigoTestBase;

public class Selenium extends IndigoTestBase {
	
	
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
	
	public Selenium(){
		PageFactory.initElements(driverindigo, this);
		System.out.println("inside selenium constructor");
	}
	

	public static void main(String[] args) throws InterruptedException {
        
		
		new IndigoTestBase();
		initialization();
		System.out.println(driverindigo.getTitle());
		Selenium obj=new Selenium();			
		
		obj.login.click();
		
		Thread.sleep(50);
		
//		obj.countrycode.clear();
//		obj.countrycode.sendKeys("91");		
//        obj.mobnum.sendKeys("9051210319");
//        obj.pwd.sendKeys("Papa@1804");
//        obj.loginbutton.click();
	
		
		
		
		//input[@id='memberCC']
	
	    //driverindigo.findElement(By.linkText("Login")).click();	
		//driverindigo.findElement(By.xpath("//a[contains(text,'Login')]")).click();
		
		
		//driverindigo.close();

	}	

}
