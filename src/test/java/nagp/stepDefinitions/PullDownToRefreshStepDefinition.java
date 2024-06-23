package nagp.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nagp.Base.TestBase;
import nagp.pages.AndroidMenuPage;
import nagp.pages.HomePage;
import nagp.pages.PullToRefreshPage;

public class PullDownToRefreshStepDefinition extends TestBase{
	
	HomePage homePage;
	AndroidMenuPage androidMenuPage;
	PullToRefreshPage pullToRefreshPage;
	
	public PullDownToRefreshStepDefinition() throws IOException
	{
		//super();
		homePage=new HomePage(driver);
		androidMenuPage= new AndroidMenuPage(driver);
		pullToRefreshPage=new PullToRefreshPage(driver);

	}

	@Given("user is on pull to refresh screen")
	public void user_is_on_pull_to_refresh_screen() {
		
		 homePage.clickOnAndroidMenu();
		    androidMenuPage.clickListView();
	}
	@When("user click on Pull to Refresh button")
	public void user_click_on_pull_to_refresh_button() {
		
		pullToRefreshPage.clickOnPullToRefreshBtn();
	}
	@When("user perform swipe down gesture")
	public void user_perform_swipe_down_gesture() {
		
		pullToRefreshPage.pullDownToRefresh();
	}
	@Then("user should able to see new item with name {string} in the list")
	public void user_should_able_to_see_new_item_with_name_in_the_list(String expectedNewItem) {
	
	String actualNewItem=pullToRefreshPage.getTextOnNewItem();
	
	Assert.assertEquals(actualNewItem, expectedNewItem,"Actual new item is "+ actualNewItem+ " and expected new item is "+expectedNewItem);
	}
	
	
}
