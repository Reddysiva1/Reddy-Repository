package com.hrms.testscripts;
import com.hrms.lib.General;
import org.testng.annotations.Test;
public class Tc004 {
	@Test
	public void tc001 () {
		General obj = new General ();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
	}

}
