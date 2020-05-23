package encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String[][] a=new String[2][2];
		a[0][0]="aaaa";
		a[0][1]="1234";
		a[1][0]="bbbb";
		a[1][1]="2222";
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		login l=new login(d);
		
		for(int i=0;i<=a.length;i++) {
			String un = a[i][0];
			String pw =a[i][1];
			System.out.println(un+ "  " +pw);
			l.setusername(un);
			l.setpassword(pw);
			l.clickbtn();
			Thread.sleep(3000);
		}
	}

}
