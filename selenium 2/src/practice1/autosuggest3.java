package practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggest3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.google.co.in/");
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
		List<WebElement> alls = d.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']"));
        System.out.println(alls.size());
        
        for(int i=0;i<alls.size();i++)
        {
        	System.out.println( alls.get(i).getText());
        	
        	if(alls.get(i).getText().contains("testing types")) {
        	alls.get(i).click();
        	break;
        	}
        	}
	}

}
