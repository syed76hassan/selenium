package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expliwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
      WebDriver d=new ChromeDriver();
      //d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      d.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
      d.manage().window().maximize();
      d.findElement(By.xpath("//button[.='Click me to start timer']")).click();
      WebDriverWait w=new WebDriverWait(d, 10);
      WebElement e = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='WebDriver']")));
     //WebElement e = d.findElement(By.xpath("//p[.='WebDriver']"));
     boolean status = e.isDisplayed();
     if(status) {
    	 
    	 System.out.println("ouput displayed");
     }
    	 else {
    		System.out.println("ERROR"); 
    	 }
     }
	}


