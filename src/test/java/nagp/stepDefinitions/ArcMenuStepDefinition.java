package nagp.stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nagp.Base.TestBase;
import nagp.pages.AndroidMenuPage;
import nagp.pages.ArcMenuPage;
import nagp.pages.HomePage;

public class ArcMenuStepDefinition extends TestBase{
	
	HomePage homePage;
	AndroidMenuPage androidMenuPage;
	ArcMenuPage arcMenuPage;
	
	public ArcMenuStepDefinition() throws IOException
	{
		//super();
		homePage=new HomePage(driver);
		androidMenuPage= new AndroidMenuPage(driver);
		arcMenuPage= new ArcMenuPage(driver);
	}
	
	@Given("user is on Arc Menu Screen")
	public void user_is_on_arc_menu_screen() {
	    homePage.clickOnAndroidMenu();
	    androidMenuPage.clickOnArcMenu();
	}
	@When("user click on Arc Menu button")
	public void user_click_on_arc_menu_button() {
	    arcMenuPage.clickOnArcMenuBtn();;
	}
	@When("user click on Android icon and then click on {string}")
	public void user_click_on_android_icon_and_then_click_on(String submenu) throws Exception {
		arcMenuPage.clickOnMainMenu();
		arcMenuPage.clickOnSubMenu(submenu);
	}
	@Then("user should see text {string}")
	public void user_should_see_text(String submenu) {
	   arcMenuPage.ToastMessage(submenu);
	}
	
}
