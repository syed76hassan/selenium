package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class counttablevalue {

	public static void main(String[] args) {
		int sum=0;
		int total=0;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/SYED%20HASSAN/Desktop/selinium%202%20se/demo2.html");
		List<WebElement> as = d.findElements(By.xpath("(//table)[1]//td[last()]"));
		int c = as.size();
		System.out.println(as.get(c-1).getText());
		for(int i=0;i<c-1;i++) {
			String s = as.get(i).getText();
			try {
				int n = Integer.parseInt(s);
				System.out.println(n);
				sum=sum+n;
			}
			catch(Exception e) {	
				
			}
			String s2 = as.get(c-1).getText();
			try {
				 total = Integer.parseInt(s2);
//			System.out.println(total);	 
			}
			
			catch(Exception e) {
				
			}
		}
			if(total==sum) {
				System.out.println("pass");
			}
				else {
					System.out.println("fail");
			}
			d.close();
		}
		
	}

	

