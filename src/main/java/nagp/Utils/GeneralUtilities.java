package nagp.Utils;

import java.text.SimpleDateFormat;

public class GeneralUtilities {

	// this method provides the current timestamp
	public static String GetCurrentTimeStamp() {
		String pattern = "yyyyMMddHHmmss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String timestampString = sdf.format(new java.util.Date());
		TestLogger.info("Returning current time stamp");
		return timestampString;
	}

	// This method provide the base path of the project
	public static String GetProjectPath() {
		return System.getProperty("user.dir");
	}

}
