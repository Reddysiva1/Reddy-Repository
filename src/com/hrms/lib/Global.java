package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global {
	WebDriver driver;
	//TestData
		public String url="http://183.82.103.245/nareshit/login.php";
		public String UserName="nareshit";
		public String Password="nareshit";
		public String EmpFirstName="siva";
		public String EmpLastName="Tester";
		public String Empinformationframe="rightMenu";
		public String Select="empid";
		public String EmpId="6382";
		//Objects/Elements
		public String txt_Loginname="txtUserName";
		public String txt_Password="txtPassword";
		public String button_Login="Submit";
		public String button_Add="//input[@value='Add']";
		public String txt_empFirstName="txtEmpFirstName";
		public String txt_empLastName="txtEmpLastName";
		public String button_Save="btnEdit";
		public String select="loc_code";
		public String button_search="loc_name";
		public String txt_checkbox="chkLocID[]";
		public String button_delete="//input[@value='Delete']";
		public String link_Logout="Logout";
		
}
