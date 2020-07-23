package spicejet.qa.util;

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

}
