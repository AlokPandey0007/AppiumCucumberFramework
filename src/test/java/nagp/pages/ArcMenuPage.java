package nagp.pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import nagp.Base.AppiumActions;

public class ArcMenuPage extends AppiumActions {
	
	private AndroidDriver driver;

	public ArcMenuPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
	}
	private By arcMenuBtn=By.id("com.boopathy.raja.tutorial:id/ArcMenu");
	private By mainMenu=By.id("com.boopathy.raja.tutorial:id/arc_main");
	private By subMenuTwitter=By.xpath("(//android.widget.ImageView[@content-desc='Android UI Design'])[1]");
	private By subMenuCamera=By.xpath("(//android.widget.ImageView[@content-desc='Android UI Design'])[2]");
	private By subMenuAIR=By.xpath("(//android.widget.ImageView[@content-desc='Android UI Design'])[3]");
	private By toastMessage=By.xpath("//android.widget.Toast[@text='Camera']");
	
	public void clickOnArcMenuBtn()
	{
		//clicking on arc menu button on arc menu page
		click(arcMenuBtn);
	}
	
	public void clickOnMainMenu()
	{
	 //clicking on main icon of arc menu
		click(mainMenu);
	}
	
	
	//clicking on sub menu of main arc menu based on name
	public void clickOnSubMenu(String subMenu) throws Exception
	{
		String subOption=subMenu.toLowerCase();
		switch(subOption) {
		case "twitter":
			click(subMenuTwitter);
			break;
		case "camera":
			click(subMenuCamera);
			break;
		case "air":
			click(subMenuAIR);
			break;
		default:
			throw new Exception("Invalid menu option type");
		}
		
	}
	
	//returning text of toast message
	public void ToastMessage(String submenu)
	{
		getText(toastMessage);
		
	}






}
