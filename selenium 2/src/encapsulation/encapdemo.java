package encapsulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class en{
	private WebElement untb;
	
	public en(WebDriver d) {
		untb=d.findElement(By.xpath("//input[@id='email']"));
	}
	public void setusername(String un) {
		untb.sendKeys(un);
	}
}


public class encapdemo {
  static {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
  }
	public static void main(String[] args) {
   WebDriver d=new ChromeDriver();
   d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   d.get("https://www.facebook.com/");
   en e=new en(d);
   e.setusername("syedhassan");
		  
		
	}

}
