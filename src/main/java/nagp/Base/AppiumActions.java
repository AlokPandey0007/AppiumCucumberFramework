package nagp.Base;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;

public class AppiumActions extends AppiumWaits {

	public AndroidDriver driver;

	public AppiumActions(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// this method will click on the element
	public void click(By by) {
		waitForElementToBeClickable(by);
		driver.findElement(by).click();

	}

	// this method will return the boolean true if element is displayed.
	public boolean isElementDisplayed(By by) {
		waitForElementToBeClickable(by);
		return driver.findElement(by).isDisplayed();

	}

	// this method will return the boolean true if element is enabled.
	public boolean isElementEnabled(By by) {
		waitForElementToBeClickable(by);
		return driver.findElement(by).isEnabled();
	}

	// this method will return the text of the element
	public String getText(By by) {
		waitForVisibilityOfElementLocated(by);
		return driver.findElement(by).getText();
	}

	//This method should return the toast message
	public String getTextFromToast(By by) {
		waitForVisibilityOfElementLocated(by);
		return driver.findElement(by).getAttribute("text");
	}

	// this method will return the list of the elements in form of web elements
	public List<WebElement> getListOfElements(By by) {
		waitForPresenceOfElementLocated(by);
		return driver.findElements(by);
	}

	// this will drag and drop the element with source and destination input
	public void dragAndDrop(By source, Integer x, Integer y) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of("elementId",
				((RemoteWebElement) driver.findElement(source)).getId(), "endX", x, "endY", y));
	}

	//this method will scroll the list till end
	public void scrollTillEnd() {
		boolean canScrollMore;

		do {

			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
					ImmutableMap.of(

							"left", 100, "top", 100, "width", 200, "height", 1000, "direction", "down", "percent", 100.0

					));

		} while (canScrollMore);

	}
	
	//this method will help to swipe down and refresh the list by taking help of first element in the list
	public void swipeDownList(By by)
	{

		
		waitForElementToBeClickable(by);
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
				"elementId",
				((RemoteWebElement) driver.findElement(by)).getId(),
			    "endX", 477,
			    "endY", 740
			));
		
		
		
	}

}
