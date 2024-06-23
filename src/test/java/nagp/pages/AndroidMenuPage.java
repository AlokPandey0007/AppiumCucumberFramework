package nagp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import nagp.Base.AppiumActions;

public class AndroidMenuPage extends AppiumActions {
	
	private AndroidDriver driver;

	public AndroidMenuPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	private By dragAndDropOption=By.xpath("//android.widget.TextView[@resource-id='com.boopathy.raja.tutorial:id/title' and @text='Drag & Drop']");
	private By listViewOption=By.xpath("//android.widget.TextView[@resource-id='com.boopathy.raja.tutorial:id/title' and @text='ListView']");
	private By arcMenuOption=By.xpath("//android.widget.TextView[@resource-id='com.boopathy.raja.tutorial:id/title' and @text='Arc Menu']");

	public void clickOnDragAndDrop()
	{
		//clicking on drag and drop option from android menu
		click(dragAndDropOption);
	}
	
	public void clickListView()
	{
		//clicking on list view option from android menu
		click(listViewOption);
	}
	
	public void clickOnArcMenu()
	{
		//clicking on arc menu option from android menu
		click(arcMenuOption);
	}
	

}
