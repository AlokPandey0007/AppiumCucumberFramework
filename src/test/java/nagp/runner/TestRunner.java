package nagp.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Cucumber option configuration
@CucumberOptions(glue={"nagp.stepDefinitions","nagp.hooks"},features="src\\test\\java\\nagp\\features",monochrome=true,
				plugin= {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				//,tags= "@DragAndDrop"
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
