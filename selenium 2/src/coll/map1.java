package coll;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the req option");
		String input = sc.nextLine();
		sc.close();
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	      WebDriver d=new ChromeDriver();
	      d.get("file:///C:/Users/SYED%20HASSAN/Desktop/selinium%202%20se/list.html");
	      WebElement list = d.findElement(By.id("slv"));
	      Select ss=new Select(list);
	      List<WebElement> ao = ss.getOptions();
	      HashMap<String, Integer> map=new LinkedHashMap<>();
	      
	      for(WebElement o:ao)
	      {
	    	String key = o.getText();
	    	
	    	if(map.containsKey(key)) {
	    		Integer v = map.get(key);
	    		v++;
	    		map.put(key, v);
	    	}
	    	else {
	    		map.put(key, 1);	
	    		}
	    	}
	      System.out.println(map);
	      Set<String> allkey = map.keySet();
	      for(String k:allkey)
	      {
	    	  System.out.println(k);
	      }
//	      to print only duplicate option
	      for(String k1:allkey) {
	    	Integer v1 = map.get(k1);
	    	if(v1==1) {
	    		System.out.println(k1);
	    	}
	      }
	      if(map.containsKey(input)) {
	    	  System.out.println("present");
	    	  }
	      else 
    		  System.out.println("not present");
    		  
	    	  if(map.get(input)>1) 
	    		  System.out.println("dupicate");
	    	  else 
	   		  System.out.println("not duplicate");
	    		  
	    	 
	      
	    	 
	      d.quit();
	      
	      }
	}
	

