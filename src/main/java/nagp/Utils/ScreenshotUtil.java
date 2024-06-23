package nagp.Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

	// this method takes driver instance and returns the byte format of the driver
	public static byte[] captureScreenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		final byte[] source = ts.getScreenshotAs(OutputType.BYTES);
		return source;

	}

}
