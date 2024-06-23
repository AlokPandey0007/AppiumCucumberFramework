package nagp.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import nagp.Base.AppiumActions;
import nagp.Utils.TestLogger;

public class HomePage extends AppiumActions{

	private AndroidDriver driver;

	public HomePage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private By welcome_text = By.xpath("//android.widget.TextView[@text='Welcome!']");
	private By options_btn = By.xpath("//android.widget.TextView[@text='OPTIONS']");
	private By options_value = By.xpath("//android.widget.TextView");
	private By androidUI_menu=By.id("android:id/up");
	private By toast = By.xpath("//android.widget.Toast");

	public String getWelcomeText() {
		TestLogger.info("Finding Text on home screen");
		
		//returning welcome text on Home page
		return getText(welcome_text);
	}

	public void clickOnOptions() {
		TestLogger.info("Clicking on OPTIONS");
		//clicking on OPTIONS
		click(options_btn);
	}

	//getting list of actions
	public List<String> getListOfOptions() {
		
		List<String> options = new ArrayList<String>();
		List<WebElement> elements = getListOfElements(options_value);
		
		for (WebElement el : elements) {
			options.add(el.getAttribute("text"));
		}
		return options;
	}
	
	
	public void clickOnAndroidMenu()
	{
		//clicking on android menu
		click(androidUI_menu);
	}
	
	//getting toast message
	public String getToastMessage()
	{
	 String msg=	getText(toast);
	 System.out.println(msg);
	 return msg;
	}
	
	
	
	
}
