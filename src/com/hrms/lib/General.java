package com.hrms.lib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.apache.log4j.Logger;
import com.hrms.utility.Log;
public class General extends Global{
public void openApplication() {
	driver = new FirefoxDriver ();
	driver.navigate().to(url);
	System.out.println("Application Opened");
	Reporter.log("Application Opened");
	Log.info("Application Opened");
}
public void closeApplication() {
driver.close();
System.out.println("Application Close");
Reporter.log("Application Close");
Log.info("Application Close");
}
public void login() {
	driver.findElement(By.name(txt_Loginname)).sendKeys(UserName);
	driver.findElement(By.name(txt_Password)).sendKeys(Password);
	driver.findElement(By.name(button_Login)).click();
	System.out.println("Login Completed");
	Reporter.log("Login Completed");
	Log.info("Login Completed");
}
public void logout() {
	driver.findElement(By.linkText(link_Logout)).click();
	System.out.println("Logout Completed");
	Reporter.log("Logout Completed");
	Log.info("Logout Completed");
}
public void enterFrame () {
	driver.switchTo().frame(Empinformationframe);
	System.out.println("Enter into Frame");
	Reporter.log("Enter into Frame");
	Log.info("Enter into Frame");
}
public void exitFrame () {
	driver.switchTo().defaultContent();
	System.out.println("Exit From Frame");
	Reporter.log("Exit From Frame");
	Log.info("Exit From Frame");
}
public void addNewEmployee () {
	driver.findElement(By.xpath(button_Add)).click();
	driver.findElement(By.name(txt_empFirstName)).sendKeys(EmpFirstName);
	driver.findElement(By.name(txt_empLastName)).sendKeys(EmpLastName);
    driver.findElement(By.id(button_Save)).click();
    System.out.println("Added New Employee");
    Reporter.log("Added New Employee");
    Log.info("Added New Employee");
}
public void deleteEmployee () {
	Select st = new Select (driver.findElement(By.name(select)));
	//st.selectByVisibleText(EmpId);
	st.selectByIndex(1);
	//st.selectByValue("0");
	driver.findElement(By.name(button_search)).sendKeys(EmpId);
	driver.findElement(By.name(txt_checkbox)).click();
	driver.findElement(By.xpath(button_delete)).click();
	System.out.println("Deleted Employee");
	Reporter.log("Deleted Employee");
	Log.info("Deleted Employee");
}

}
