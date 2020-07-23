package spicejet.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class PracticeSelenium {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",  "E:\\Eclipse\\GoogleAutomation\\drivers\\chrome\\chromedriver.exe");	
		WebDriver driverpractice = new ChromeDriver(); 
		driverpractice.manage().window().maximize();
		driverpractice.manage().deleteAllCookies();
	
		driverpractice.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);		 
		driverpractice.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); 

		driverpractice.get("https://www.demoqa.com/links");
		 List <WebElement> list = driverpractice.findElements(By.tagName("a"));
		 
		 System.out.println(list.size());
		 
		 for(int i=0;i<list.size();i++){
			 System.out.println(list.get(i).getText());
			 
		 }
		
		
		 driverpractice.quit();
	}

}
