package spicejet.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import spicejet.qa.util.TestUtil;



public class IndigoTestBase {
	
	public static WebDriver driverindigo;
	public static Properties propindigo;
	
	public IndigoTestBase(){
		
		System.out.println("inside testbase constructor");
		
			try {
				propindigo = new Properties();
				//System.out.println(System.getProperty("user.dir"));
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/spicejet"
						+ "/qa/config/indigoconfig.properties");
				propindigo.load(ip);
				//System.out.println(prop.getProperty("url"));
				System.out.println("completed testbase constructor");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
/*	public static void main(String[] args) {
		
		IndigoTestBase obj = new IndigoTestBase();
		System.out.println(propindigo.getProperty("indigourl"));
		IndigoTestBase.initialization();
		
	}*/
		
		public static void initialization(){
			String browserName = propindigo.getProperty("browser");
			
			System.out.println("inside initialization");
			
			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver",  "E:\\Eclipse\\GoogleAutomation\\drivers\\chrome\\chromedriver.exe");	
				driverindigo = new ChromeDriver(); 
			}
			else if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver", "E:\\Eclipse\\GoogleAutomation\\drivers\\Firefox\\geckodriver-v0.26.0-win64\\geckodriver.exe");	
				driverindigo = new FirefoxDriver(); 
			}
			
			
		/*	e_driver = new EventFiringWebDriver(driver);
			// Now create object of EventListerHandler to register it with EventFiringWebDriver
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver = e_driver;*/
			
			driverindigo.manage().window().maximize();
			driverindigo.manage().deleteAllCookies();
		
		 	driverindigo.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);		 
			driverindigo.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS); 
			
/*			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);		 
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
			
			driverindigo.get(propindigo.getProperty("indigourl"));
			System.out.println("completed initialization");
			
	       }
	

}
