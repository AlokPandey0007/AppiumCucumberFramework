package nagp.pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import nagp.Base.AppiumActions;

public class PullToRefreshPage extends AppiumActions {
	
	private AndroidDriver driver;

	public PullToRefreshPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
	}
	private By pullToRefreshBtn=By.id("com.boopathy.raja.tutorial:id/List_PullToRefresh");
	
	private By newItemInList=By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='NEW ITEM ADDED']");
	private By firstItemInList=By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='Boopathy Raja']");
	
	public void clickOnPullToRefreshBtn()
	{
		//clicking on "pull to refresh" button
		click(pullToRefreshBtn);
	}

	public void pullDownToRefresh()
	{
		//performing pull down gesture
		swipeDownList(firstItemInList);
	}

	public String getTextOnNewItem()
	{
		//returning text of new item in the list
		waitForVisibilityOfElementLocated(newItemInList);
	return	getText(newItemInList);
		
	}






}
