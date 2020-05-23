package practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class suggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.google.com/");
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		List<WebElement> alls = d.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='sbtc']"));
             System.out.println(alls.size());
             
             for(WebElement link:alls) {
            	 System.out.println(link.getText());
            	if(link.getText().contains("java 8 features")) {
            		link.click();
            		break;
             }
         }
//             d.close();
	}

}
