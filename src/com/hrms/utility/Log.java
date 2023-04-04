package com.hrms.utility;
import org.apache.log4j.Logger;
public class Log {
private static Logger Log=Logger.getLogger(org.openqa.selenium.bidi.log.Log.class);
// Need to create these methods, so that they can be called
public static void  info(String message) {
	Log.info(message);
}
}
