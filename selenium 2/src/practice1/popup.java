package practice1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class popup {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	WebDriver d=new FirefoxDriver();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.get("https://www.goibibo.com/");
	/*d.manage().window().maximize();
	Alert alert = d.switchTo().alert();
	String msg = alert.getText();
	System.out.println(msg);
	alert.dismiss();*/
	 //d.findElement(By.xpath("//button[.='Ok']")).click();
//	d.findElement(By.xpath("//a[.='14']/..")).click();
//	d.findElement(By.xpath("//input[@id='DepartDate']")).click();
//	d.findElement(By.linkText("9")).click();
//    d.findElement(By.id("departureCalendar")).click();
//    d.findElement(By.xpath("//div[.='14']")).click();
	String[] t = new Date().toString().split(" ");
	String s = t[2];
	 d.findElement(By.id("departureCalendar")).click();
	  d.findElement(By.linkText(s)).click();
	 
	}

}
