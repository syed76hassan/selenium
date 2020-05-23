package Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pro2 {
	@BeforeTest
	public void OpenApp() {
     Reporter.log("app opening",true);		
	}

	@AfterTest
	public void CloseTest() {
		Reporter.log("closing app",true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout(){
		Reporter.log("logout");
	}
	
	@Test(invocationCount=2)
	public void createuser() {
		Reporter.log("user created",true);
	}
	@Test
	public void deleteuser() {
		Reporter.log("user deleted",true);
	}
}
