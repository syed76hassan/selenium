package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/SYED%20HASSAN/Desktop/selinium%202%20se/p1.html");
		for(int i=0;i<5;i++) {
        d.findElement(By.cssSelector("input[id='a2']")).sendKeys("i love muskan");
       
		}
	}

}
