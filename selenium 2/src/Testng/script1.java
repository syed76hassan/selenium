package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class script1 {
	 static {
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  }
	 
	 @DataProvider
	 public Object getdata() {
		 Object[][] a=new Object[3][2];
		 a[0][0]="abcd";
		 a[0][1]="1234";
		 a[1][0]="efgh";
		 a[1][0]="4567";
		 a[2][0]="hassan";
		 a[2][1]="7204";
		 return a;
	 }
	@Test(dataProvider="getdata")
	public void run(String un,String pw) {
		WebDriver d=new ChromeDriver();
		d.get("http://localhost:8080/login.do");
		Loginpage l=new Loginpage(d);
		l.login(un,pw);
	}
}
