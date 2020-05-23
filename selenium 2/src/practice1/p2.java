package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class p2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.get("file:///C:/Users/SYED%20HASSAN/Desktop/selinium%202%20se/f2.html");
      d.findElement(By.cssSelector("a[name='n1']")).click();
      d.findElement(By.cssSelector("input[class='c1']")).sendKeys("hhhhh");
        
	}

}
