package nagp.Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumFluentWait;

import org.openqa.selenium.support.ui.FluentWait;


//This class is for the waits in appium.
//We can add multiple waits method in this class as per our need
public class AppiumWaits {

	AppiumDriver driver;
	public  AppiumWaits(AppiumDriver driver) {
		
		this.driver=driver;

	}
	
    public WebElement waitForPresenceOfElementLocated(By by)
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    
    public WebElement waitForElementToBeClickable(By by)
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    
    public WebElement waitForElementToBeClickable(WebElement element)
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    
    public WebElement waitForVisibilityOfElementLocated(By by)
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    
    public WebElement waitForVisibilityOfElement(WebElement element)
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       return wait.until(ExpectedConditions.visibilityOf(element));
    }
    
    public Boolean waitForAttributeToBe(WebElement element,String text)
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.attributeToBe(element,"text",text));
    }
}
