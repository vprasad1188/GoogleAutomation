package spicejet.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@FindBy(xpath="//li[@class='profile-login slt-profile-login']//span[@class='avatar']")
	WebElement iconarrow;
	
	@FindBy(xpath="//li[@class='profile-login slt-profile-login']//span[@id='grabText']")
	WebElement userProfilename;
	
	@FindBy(xpath="//i[@class='icon-icHamburger']")
	WebElement homeHamburger;
	
	@FindBy(xpath="//span[@class='log-sign userName']")
	WebElement userNameDisplayed;
	
	@FindBy(xpath="//div[@id='gp-title']")
	WebElement infoPopup;
	
	@FindBy(xpath="//div[@id='gp-msg']")
	WebElement infoPopupmsg;
	
	
	
	
	public Selenium(){
		PageFactory.initElements(driverindigo, this);
		System.out.println("inside selenium constructor");
	}
	

	public static void main(String[] args) throws InterruptedException  {
        
		
		new IndigoTestBase();
		initialization();
		System.out.println(driverindigo.getTitle());
		Selenium obj=new Selenium();			
		
		obj.login.click();
		
		Thread.sleep(2000);
		
		obj.countrycode.clear();
		obj.countrycode.sendKeys("91");		
        obj.mobnum.sendKeys("9051210319");
        obj.pwd.sendKeys("Papa@1804");
        obj.loginbutton.click();
       // Thread.sleep(6000);  // wait for 1 second 1000 milliseconds      
//        driverindigo.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
//        driverindigo.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
        
        new WebDriverWait(driverindigo,20).until(ExpectedConditions.visibilityOf(obj.infoPopup)); 
        String info = obj.infoPopup.getText();          
        String info1 = obj.infoPopupmsg.getText();  
        System.out.println(info);
        System.out.println(info1);
     
        //Thread.sleep(10000);
      //  driverindigo.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
//        new WebDriverWait(driverindigo,20).until(ExpectedConditions.visibilityOf(obj.iconarrow)); 
        driverindigo.navigate().refresh(); 
        obj.iconarrow.click(); 
        Thread.sleep(3000);
        
        
//        Actions act = new Actions(driverindigo);
//        act.moveToElement(obj.iconarrow).click().build().perform();
        
        String s =obj.userProfilename.getText(); 
        System.out.println(s);
        System.out.println("end");
        
        
	
		
		
		
		//input[@id='memberCC']
	
	    //driverindigo.findElement(By.linkText("Login")).click();	
		//driverindigo.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		
		driverindigo.close();

	}	

}
