package practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_allinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
      WebDriver d=new ChromeDriver();
      d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      d.get("https://www.flipkart.com/");
      d.findElement(By.xpath("//button[.='✕']")).click();
      List<WebElement> links = d.findElements(By.xpath("//a"));
      int count = links.size();
      System.out.println(count);
      int visible=0;
      for(int i=0;i<count;i++) {
    	  WebElement link = links.get(i);
    	  if(link.isDisplayed()) {
    		  visible++;
    	  }  
    		  String text = link.getText();
    		  if(text.length()!=0) {
    			  System.out.println(text);
    		  }
    		  System.out.println(visible);
    	  }
//    	 
      }
	}


