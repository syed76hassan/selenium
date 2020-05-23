package practice1;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlinglist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter mtr or slv");
		String s = sc.nextLine();
		   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		      WebDriver d=new ChromeDriver();
		      d.get("file:///C:/Users/SYED%20HASSAN/Desktop/selinium%202%20se/list.html");
		      WebElement lb = d.findElement(By.id(s));
		      Select ss=new Select(lb);
//		      ss.selectByIndex(1);
//		      ss.selectByValue("v");
//		      ss.selectByVisibleText("roti");
		   /* List<WebElement> so = ss.getAllSelectedOptions();
		    for(WebElement o:so)
		      System.out.println(o.getText()); */
//		      System.out.println(ss.getFirstSelectedOption().getText());
		      
		      List<WebElement> go = ss.getOptions();
		      
		      for(WebElement o:go)
		    	  System.out.println(o.getText());
		      if(ss.isMultiple()) {
//		    	  ss.deselectByIndex(1);
//		    	  ss.deselectByValue("v");
		    	  ss.deselectAll();
		      }
		      
	d.close();
		      
		      
	}

}
