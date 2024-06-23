package nagp.Base;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.core.runtime.UuidGeneratorServiceLoader;
import nagp.Utils.GeneralUtilities;
import nagp.Utils.TestLogger;

public class TestBase 
{
	public static AndroidDriver driver;
	public static com.aventstack.extentreports.ExtentReports extent;
	public static ExtentTest extenTest;
	
	public TestBase() throws IOException
	{
		//ExecuteDriver();
	}
	
	//this method creates appium driver using capabilities.
    public static void ExecuteDriver( ) throws IOException
    {
    	
      //It will capture the path of the apk file stored in resource folder	
      String appPath=GeneralUtilities.GetProjectPath()+"\\src\\test\\resources\\Android_UI_Design-1.0 1.apk";
      
      //Adding appium capabilities to launch application.
      DesiredCapabilities capabilities=new DesiredCapabilities();
      capabilities.setCapability("newCommandTimeout", 300);
      capabilities.setCapability("automationName", "UiAutomator2");
      capabilities.setCapability("platformName", "Android");
      capabilities.setCapability("platformVersion", "8.0");
      capabilities.setCapability("appWaitActivity", "com.boopathy.raja.tutorial.Splash");
      capabilities.setCapability("appWaitPackage", "com.boopathy.raja.tutorial");
      capabilities.setCapability("app", appPath);
      capabilities.setCapability("deviceName", "Android");
      capabilities.setCapability("autoAcceptAlerts", true);
    //  capabilities.setCapability("plugins", capabilities);
      TestLogger.info("Creating appium driver");
      
      //creating driver instance of appium.
      driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    
    public static AppiumDriver getDriver()
    {
    	return driver;
    }
    
    
    
    
}
