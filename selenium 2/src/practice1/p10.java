package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        WebDriver d=new ChromeDriver();
        d.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        d.findElement(By.xpath("//button[.=\"Click me to start timer\"]")).click();
        WebDriverWait w=new WebDriverWait(d, 15);
        WebElement e = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='WebDriver']")));
        boolean status = e.isDisplayed();
        if(status)
        	System.out.println("displayed"+e.getText());
        else
        	System.out.println("not displayed");
	}

}
