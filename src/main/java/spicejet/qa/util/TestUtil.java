package spicejet.qa.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public static void refreshdriver(WebDriver driver){
		driver.navigate().refresh();
	}
	
	public static void waitForElement(WebDriver driver,WebElement element){
		new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(element)); 
	}
	
	public static void feedValueAfterWait(WebDriver driver,WebElement element, int timeout, String value){
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element)); 
		element.sendKeys(value);
	}
	
	public static void clickAfterWait(WebDriver driver,WebElement element, int timeout){
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.click();
	}
	
	public static void flash(WebDriver driver,WebElement element){
		String bgcolor = element.getCssValue("backgroundColor");
			for(int i=0;i<=100;i++)
		{
			changeElementColor("rgb(255,0,0)",driver,element);
			changeElementColor(bgcolor,driver,element);
		}
		
	}
	
	public static void changeElementColor(String color,WebDriver driver,WebElement element){
		JavascriptExecutor js = ((JavascriptExecutor)driver);//((JavascriptExecutor)driver) is object of class 
		//((JavascriptExecutor)driver) is converting driver into JavascriptExecuotr
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		try
		{
			Thread.sleep(200);
		}catch (InterruptedException e){
			};
		
	}

}
