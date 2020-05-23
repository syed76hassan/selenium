package Testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class pro1 {

	/*@Test
	public void dabba() {
		Reporter.log("this is String",true);
	}
	
	@Test(invocationCount=2)
	public void jabba() 
	{
		Reporter.log("dabba jabba",true);
	} */
	
	@DataProvider 
	public Object[][] getdata(){
		Object[][] a=new Object[3][2];
		a[0][0]="userA";
		a[0][1]=123;
		a[1][0]="userB";
		a[1][1]=456;
		a[2][0]="userC";
		a[2][1]=789;
		return a;
	}
	@Test(dataProvider="getdata")
	public void createuser(String un,int pw) {
		Reporter.log("create user :"+un+":"+pw,true);
	}
				
	@Test
	public void asser() {
		String un="hassan";
		String pw="hassan";
		SoftAssert s=new SoftAssert();
		s.assertEquals(un, pw);
		
		Reporter.log("hello wolrd",true);
		Reporter.log("bye bye world",true);
		s.assertAll();
	}
	@Test(dependsOnMethods="asser")
	public void deleteasser() {
		Reporter.log("delete aser",true);
	}
	
	
	
}
	

