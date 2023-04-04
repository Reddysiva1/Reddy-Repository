package com.hrms.testscripts;
import com.hrms.lib.General;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
public class Tc001 {
//public static void main(String args[]) {
	//test steps
	@Test
	public void tc001 () {
		DOMConfigurator.configure("log4j.xml");
	General obj = new General ();
	obj.openApplication();
	obj.login();
	obj.logout();
	obj.closeApplication();
}
}
