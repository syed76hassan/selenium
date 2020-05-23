package encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class script3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[][] a=new String[2][2];
		a[0][0]="aaaa";
		a[0][1]="1234";
		a[1][0]="bbbb";
		a[1][1]="2222";
		WebDriver d=new ChromeDriver();
		d.get("http://localhost:8080/login.do");
	    Loginpage1 l=new Loginpage1();
	    PageFactory.initElements(d, l);
	    for(int i=0;i<a.length;i++) {
	    	String un = a[i][0];
	    	String pw = a[i][1];
	    	
	    	System.out.println(un+" "+pw);
	    	
	    	l.setusername(un);
	    	l.setpassword(pw);
	    	l.clicklogin();
	    	Thread.sleep(3000);
	    	
	    }
	}

}
