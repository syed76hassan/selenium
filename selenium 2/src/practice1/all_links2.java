package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_links2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
      WebDriver d=new ChromeDriver();
      d.get("https://www.flipkart.com/");
      d.findElement(By.xpath("//button[.='✕']")).click();
//      d.findElement(By.linkText("//a"));
      List<WebElement> l = d.findElements(By.xpath("//a"));
      System.out.println(l.size());
      System.out.println(" zero link " + l.get(0).getText());
      int visible=0;
      for(int i=0;i<l.size();i++)
      {
    	  WebElement link = l.get(i);
    	  if(link.isDisplayed())
    		  visible++;
    	  
    	  String text = link.getText();
    	  if(text.length()!=0)
    		  System.out.println(visible+" "+text);
    	  
    	  
      }
      System.out.println("visible links " + visible );
	}

}
