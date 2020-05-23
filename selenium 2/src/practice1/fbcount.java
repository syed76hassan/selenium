package practice1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	      WebDriver d=new ChromeDriver();
	      d.get("https://www.facebook.com/");
	      WebElement list = d.findElement(By.id("month"));
	      Select s=new Select(list);
	      List<WebElement> go = s.getOptions();
	      ArrayList<String> alltext = new ArrayList<>();
	      for(WebElement o:go) {
	    	  alltext.add(o.getText());
	      }
	       Collections.sort(alltext);
	       for(String text:alltext) {
	    	   System.out.println(text);
	       }
	       
	}

}
