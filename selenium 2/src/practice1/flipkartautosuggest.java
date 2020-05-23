package practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkartautosuggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.flipkart.com/");
		 d.findElement(By.xpath("//button[.='✕']")).click();
		d.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("phone");

	//	List<WebElement> as = d.findElements(By.xpath("//ul[contains(@class,'col-12-12 _1PBbw8')]/li"));
//	
	WebDriverWait w=new WebDriverWait(d, 15);
	
	List<WebElement> as = w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[contains(@class,'col-12-12 _1PBbw8')]/li")));
	System.out.println(as.size());
	for(int i=0;i<as.size();i++) {
		System.out.println(as.get(i).getText());
		
		if(as.get(i).getText().contains("mobiles"))
			as.get(i).click();
		break;
		
		}
	d.close();
		}
	
	
	}

	

