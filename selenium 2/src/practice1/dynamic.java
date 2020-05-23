package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
      WebDriver d=new ChromeDriver();
      d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      d.get("https://freecrm.co.in/");
      d.findElement(By.xpath("//span[.='Log In']")).click();;
      
      d.findElement(By.xpath("//input[@name='email']")).sendKeys("syed16hassan@gmail.com");
      WebElement text = d.findElement(By.xpath("//input[@name='password']"));
      WebElement btn = d.findElement(By.xpath("//div[@class='ui fluid large blue submit button']/."));
   flash(text, d);
   drawborder(btn, d);   
//   generatealert(d, "there is error in dialogue");
   System.out.println(getTitle(d));
   System.out.println(getinnertext(d));
   scrollby(d);
      }
	public static void flash(WebElement e,WebDriver d) {
		JavascriptExecutor js=((JavascriptExecutor)d);
		String bgcolor = e.getCssValue("backgroundColor");
		for(int i=0;i<100;i++) {
			changecolor("red", e, d);
			changecolor(bgcolor, e, d);
		}
		
	}

	public static void changecolor(String color,WebElement e,WebDriver d) {
		JavascriptExecutor js=((JavascriptExecutor)d);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",e);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		}
	public static void drawborder(WebElement e,WebDriver d) {
		JavascriptExecutor js=((JavascriptExecutor)d);
		js.executeScript("arguments[0].style.border='3px red solid'",e);
		}
	
	public static void generatealert(WebDriver d,String message) {
		JavascriptExecutor js=((JavascriptExecutor)d);
		js.executeScript("alert('"+message+"')");
	}
	
	public static String getTitle(WebDriver d) {
		JavascriptExecutor js=((JavascriptExecutor)d);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getinnertext(WebDriver d) {
		JavascriptExecutor js=((JavascriptExecutor)d);
		String text = js.executeScript("return document.documentElement.innerText;").toString();
		return text;
	}
	
	public static void scrollby(WebDriver d) {
		JavascriptExecutor js=((JavascriptExecutor)d);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	}

