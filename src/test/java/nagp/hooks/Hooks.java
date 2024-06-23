package nagp.hooks;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;

import nagp.Utils.GeneralUtilities;
import nagp.Utils.TestLogger;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.ServerArgument;
import io.cucumber.core.gherkin.Step;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import nagp.Base.TestBase;
import io.cucumber.java.Before;

public class Hooks {
	static AppiumDriverLocalService appiumService;

	public Hooks() {

	}

	@BeforeAll
	public static void BeforeAll() {

		// Launching appium server on default url and port.
		TestLogger.info("Running Before All method");
		
	
//		appiumService = AppiumDriverLocalService.buildDefaultService()
//				.buildService(new AppiumServiceBuilder().withArgument(()->"--use-plugins", "gestures"));
		
		appiumService = AppiumDriverLocalService.buildDefaultService();
				
		TestLogger.info("Starting Appium service.");
		appiumService.start();
		TestLogger.info("Appium service started.");
	}

	@Before
	public void Before() {

	}

	@Before
	public void Before(Scenario scenario) throws IOException {

		TestLogger.info("Launching application");
		TestBase.ExecuteDriver();
		TestLogger.info("Application launched");
	}

	@BeforeStep
	public void BeforeStep(Scenario scenario) throws IOException {

	}

	@After
	public void After(Scenario scenario) {
		TestLogger.info("Running After scenario");
		if (scenario.isFailed()) {

			// capturing screenshot in case of scenario fails.
			TestLogger.info("Scenario Failed.. Capturing screenshot.");
			byte[] path = nagp.Utils.ScreenshotUtil.captureScreenshot(TestBase.getDriver());
			scenario.attach(path, "image/png", "image");

		}

		// Quitting application
		TestBase.getDriver().quit();
	}

	@AfterAll
	public static void AfterAll() {
		try {
		TestLogger.info("Execution ends. Stopping appium service.");

		// Stopping appium server.
		}finally {
		appiumService.stop();
		TestLogger.info("Appium service stopped.");
		}
	}

}
