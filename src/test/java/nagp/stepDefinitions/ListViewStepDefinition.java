package nagp.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nagp.Base.TestBase;
import nagp.pages.AndroidMenuPage;
import nagp.pages.HomePage;
import nagp.pages.ListViewPage;

public class ListViewStepDefinition extends TestBase {

	AndroidMenuPage androidMenuPage;
	HomePage homePage;
	ListViewPage listViewPage;

	public ListViewStepDefinition() throws IOException {
		
		androidMenuPage = new AndroidMenuPage(driver);
		homePage=new HomePage(driver);
		listViewPage=new ListViewPage(driver);
	}

	@Given("user is on List View screen")
	public void user_is_on_list_view_screen() {
		homePage.clickOnAndroidMenu();
		androidMenuPage.clickListView();
	}

	@When("user click on quick scrollbar")
	public void user_click_on_quick_scrollbar() {
	listViewPage.clickQuickScrollBar();
		
	}

	@Then("user should see his {string} country on scroll")
	public void user_should_see_his_country_on_scroll(String expectedCountry) {
	String actualCountry=	listViewPage.scrollToFindCountry("China");
	Assert.assertEquals(actualCountry, expectedCountry,"Actual country is "+actualCountry+ " and Expected country is " +expectedCountry);
	}

}
