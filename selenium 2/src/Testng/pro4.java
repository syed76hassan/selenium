package Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class pro4 {
	
	@BeforeTest(alwaysRun=true)
	public void login()
	{
		Reporter.log("login",true);
	}
    @AfterTest(alwaysRun=true)
    public void logout() {
    Reporter.log("logout",true);
    }
    @Test(groups= {"customer","smoke"})
    public void createuser() {
    	Reporter.log("create customer",true);
    }
    
    @Test(groups= "customer",enabled=false)
    public void deleteuser() {
    	Reporter.log("deleteuser",true);
    }
    
    @Test(groups= {"customer","smoke"})
    public void createproject() {
    	Reporter.log("create project",true);
    }
    @Test(groups="customer",enabled=false)
    public void deleteproject() {
    	Reporter.log("delete project",true);
    }
    
}
