package encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	private static WebDriver d;
	private static login l;

	public static void OpenApp() {
		d=new ChromeDriver();
		d.get("https://www.facebook.com/");
	}
	public static void CloseApp() {
		d.close();
	}
	
	public static void login(String un,String pw) {
		l=new login(d);
		l.setusername(un);
		l.setpassword(pw);
		l.clickbtn();
	}
	public static void main(String[] args) throws InterruptedException {
		
		
		OpenApp();
		
		l=new login(d);
		//invalid Login

		l.setusername("syed");
		d.navigate().refresh();
		l.setpassword("858446545");
		CloseApp();
		
		//valid login
		
		OpenApp();
		l.setusername("syed hassan");
		l.setpassword("858446545");
		l.clickbtn();
		CloseApp();
		

	}

}
