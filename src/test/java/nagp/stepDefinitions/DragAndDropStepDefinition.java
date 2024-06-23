package nagp.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nagp.Base.TestBase;
import nagp.pages.AndroidMenuPage;
import nagp.pages.DragAndDropPage;
import nagp.pages.HomePage;

public class DragAndDropStepDefinition extends TestBase{
	
HomePage homePage;
AndroidMenuPage androidMenuPage;
DragAndDropPage dragAndDropPage;
	
	public DragAndDropStepDefinition() throws IOException
	{
		//super();
		homePage=new HomePage(driver);
		androidMenuPage= new AndroidMenuPage(driver);
		dragAndDropPage =new DragAndDropPage(driver);
	}
	
	@Given("user is on drag and drop screen")
	public void user_is_on_drag_and_drop_screen() {
	    homePage.clickOnAndroidMenu();
	    androidMenuPage.clickOnDragAndDrop();
	}

	@When("user click on Sample DragDrop")
	public void user_click_on_sample_drag_drop() {
	dragAndDropPage.clickOnSampleDragAndDrop();
	}
	@Then("user should able to drag and drop")
	public void user_should_able_to_drag_and_drop() throws InterruptedException {
	   dragAndDropPage.DragAndDrop();
	   
	}
	@Then("user should see drag element as focused after drag and drop")
	public void user_should_see_drag_element_as_focused_after_drag_and_drop() {
	String a=	dragAndDropPage.verifyIfDragAndDropped();
	Assert.assertTrue(Boolean.parseBoolean(a), "Is element dragged "+a);
	}

}
