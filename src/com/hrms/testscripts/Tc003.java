package com.hrms.testscripts;
import com.hrms.lib.General;
public class Tc003 {
	public static void main(String[] args) {
		General obj = new General ();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.deleteEmployee();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
	}

}
