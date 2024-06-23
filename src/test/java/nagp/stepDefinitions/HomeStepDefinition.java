package nagp.stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nagp.Base.TestBase;
import nagp.Utils.TestLogger;
import nagp.pages.HomePage;

public class HomeStepDefinition extends TestBase{
	
	HomePage homePage;
	
	public HomeStepDefinition() throws IOException
	{
		//super();
		homePage=new HomePage(driver);
	}

	@When("application is launched")
	public void application_is_launched(){
		TestLogger.info("Launching application");
	}

	@Then("i should see the welcome message {string}")
	public void i_should_see_the_welcome_message(String expectedMessage) throws InterruptedException {
	//	Thread.sleep(5000);
		
		String actualMessage = homePage.getWelcomeText();
		Assert.assertEquals(actualMessage, expectedMessage);
		
	}
	
	@When("i click on OPTIONS")
	public void i_click_on_options() throws InterruptedException {
		//Thread.sleep(5000);
	   homePage.clickOnOptions();
	}

	@Then("i should see the following options")
	public void i_should_see_the_following_options(DataTable dataTable) {
	    List<String> actualOptions=homePage.getListOfOptions();
	   List<String> expectedOptions= dataTable.asList();
	   Assert.assertEquals(actualOptions, expectedOptions);
	}

	@When("i navigate back on home page")
	public void i_navigate_back_on_home_page() {
	 // homePage.navigateBack();
	}
	@Then("i should see the toast message {string}")
	public void i_should_see_the_toast_message(String string) {
	 homePage.getToastMessage();
	}



	
}
