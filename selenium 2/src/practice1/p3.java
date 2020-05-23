package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.get("file:///C:/Users/SYED%20HASSAN/Desktop/selinium%202%20se/p4.html");
        d.findElement(By.cssSelector("a#a1")).click();
	}

}
