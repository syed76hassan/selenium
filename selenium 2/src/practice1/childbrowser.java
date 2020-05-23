package practice1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    WebDriver d=new ChromeDriver();
    d.get("https://www.naukri.com");
    String mainwindow = d.getWindowHandle();
    Set<String> allwindows = d.getWindowHandles();
    for(String windows:allwindows) {
    	
    	System.out.println(windows);
    	Thread.sleep(3000);
    	String t = d.switchTo().window(windows).getTitle();
    	System.out.println(t);
    	if(!(mainwindow.equals(windows)))
    	d.switchTo().window(windows).close();  	
    	}
    }
	}


