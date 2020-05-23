package encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Script1 {
	 static {
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  }
	public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");
	Loginpage p=new Loginpage();
	
	String[][] a=new String[2][2];
	a[0][0]="aaaa";
	a[0][1]="1234";
	a[1][0]="bbbb";
	a[1][1]="2222";
	
	PageFactory.initElements(d, p);
	
	for(int i=0;i<=a.length;i++) {
		String un=a[i][0];
		String pw=a[i][1];
		
		System.out.println(un+"  "+pw);
		
		p.setusername(un);
		p.setpassword(pw);
		p.clicklogin();
		
	}
	

	}

}
