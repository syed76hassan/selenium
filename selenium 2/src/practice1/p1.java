package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/SYED%20HASSAN/Desktop/selinium%202%20se/p1.html");
		String title = d.getTitle();
		System.out.println("title = "+title);
		String window = d.getWindowHandle();
            System.out.println("windowhandle"+window);
            String c = d.getCurrentUrl();
            System.out.println("currenturl"+c);
           d.close();
            System.out.println();
	}

}
