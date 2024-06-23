package nagp.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import nagp.Base.AppiumActions;

public class DragAndDropPage extends AppiumActions {
	
	private AndroidDriver driver;

	public DragAndDropPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	private By sampleDragAndDropBtn=By.id("com.boopathy.raja.tutorial:id/Drag_and_Drop_Simple");
	
	private By dragSource=By.id("com.boopathy.raja.tutorial:id/DragDrop_Drag1");
	private By dropDestination=By.id("com.boopathy.raja.tutorial:id/DragDrop_Drop1");
	private By toastMessage=By.xpath("/hierarchy/android.widget.Toast");
			
	
	public void clickOnSampleDragAndDrop()
	{
		//clicking on Sample drag and drop button
		click(sampleDragAndDropBtn);
	}
	
	public void DragAndDrop() throws InterruptedException
	{
		//dragging and drop element on specific location
		waitForElementToBeClickable(dragSource);
		dragAndDrop(dragSource, 890,442);
		
	}
	
	//verifying if drag and drop worked and returning boolean value
	public String verifyIfDragAndDropped()
	{
		String value=driver.findElement(dragSource).getAttribute("focusable");
		
		System.out.println(value);
		return value;
	}
}
