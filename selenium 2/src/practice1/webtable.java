package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.visitor.ExceptionTableSensitiveMethodVisitor;

public class webtable {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int sum=0;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/SYED%20HASSAN/Desktop/selinium%202%20se/demo2.html");
		 List<WebElement> rc = d.findElements(By.xpath("(//table)[1]//tr"));
		System.out.println(rc);
		 List<WebElement> hc = d.findElements(By.xpath("(//table)[1]//th"));
		System.out.println(hc);
	 List<WebElement> cc = d.findElements(By.xpath("(//table)[1]//td"));
			System.out.println(cc);
			
			/*printing headers
			
		for(WebElement h:hc)
		{
			System.out.println(h.getText());
		}
		
//		printing cells
		for(WebElement c:cc) {
			System.out.println(c.getText());
		}
//		printing all rows
		for(WebElement r:rc) {
			System.out.println(r.getText());
		}  
//		counting total
			List<WebElement> ac = d.findElements(By.xpath("(//table)[1]//td"));
		
			for(WebElement a:ac) {
				String s = a.getText();
				try {
				int n = Integer.parseInt(s);
				System.out.println(n);
				sum=sum+n;
				}
				catch(Exception e) {
					
				}*/
	
//			System.out.println(sum);
//			d.close();
			
//			counting only marks
			 List<WebElement> total = d.findElements(By.xpath("(//table)[1]//td[last()]"));
			for( WebElement t:total) {
				String s = t.getText();
				try {
					int n=Integer.parseInt(s);
					System.out.println(n);
					sum=sum+n;
				}
				catch(Exception e) {
				}
			}
			System.out.println(sum);
			d.close();
	}

}
