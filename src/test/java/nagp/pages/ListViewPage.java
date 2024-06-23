package nagp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import nagp.Base.AppiumActions;

public class ListViewPage extends AppiumActions{

	private AndroidDriver driver;

	public ListViewPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	private By quickScrollBarBtn=By.id("com.boopathy.raja.tutorial:id/List_ScrollQuick");
	private By countryOption=By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='Zambia']");
	
	public void clickQuickScrollBar()
	{
		//clicking on Quick ScrollBar
		click(quickScrollBarBtn);
	}
	
	public String scrollToFindCountry(String country)
	{
		//scrolling list till end
		scrollTillEnd();
		
		//getting text for the country
		String countryName=	getText(countryOption);
		System.out.println(countryName);
		return countryName;
		
		
		
	}
	
}
