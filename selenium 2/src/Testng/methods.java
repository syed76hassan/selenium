package Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class methods {
	
	@BeforeTest
	public void openApp() {
		Reporter.log("opening app",true);
	}
	
	@AfterTest
	public void closeApp() {
		Reporter.log("closing app",true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("logging",true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("logging out",true);
	}
	
	@Test
	public void test() {
		Reporter.log("test 1 running");
	}
	
	@Test
	public void test2() {
		Reporter.log("test 2 running");
	}
}
