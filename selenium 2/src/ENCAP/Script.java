package ENCAP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
    
		WebDriver d=new ChromeDriver();
		d.get("http://localhost:8080/login.do");
		Loginpage l=new Loginpage(d);
		l.login("ayed", "1234");
		Thread.sleep(3000);
		l.login("hassan", "1235");
		Thread.sleep(3000);
		l.login("admin", "1234");
       

	}

}
