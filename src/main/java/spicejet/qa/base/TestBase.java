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



public class TestBase {
	
	static WebDriver driver;
	static Properties prop;
	
	public TestBase(){
		
			try {
				prop = new Properties();
				//System.out.println(System.getProperty("user.dir"));
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/spicejet"
						+ "/qa/config/spicejetconfig.properties");
				prop.load(ip);
				//System.out.println(prop.getProperty("url"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	public static void main(String[] args) {
		
		TestBase obj = new TestBase();
		System.out.println(prop.getProperty("url"));
		TestBase.initialization();
		
	}
		
		public static void initialization(){
			String browserName = prop.getProperty("browser");
			
			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver",  "E:\\Eclipse\\GoogleAutomation\\drivers\\chrome\\chromedriver.exe");	
				driver = new ChromeDriver(); 
			}
			else if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver", "");	
				driver = new FirefoxDriver(); 
			}
			
			
		/*	e_driver = new EventFiringWebDriver(driver);
			// Now create object of EventListerHandler to register it with EventFiringWebDriver
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver = e_driver;*/
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
		 	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);		 
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS); 
			
/*			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);		 
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
			
			driver.get(prop.getProperty("url"));
			
	       }
	

}
