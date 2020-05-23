package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
       WebDriver d=new ChromeDriver();
       d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       d.manage().window().maximize();
       d.get("https://www.monsterindia.com/");
       d.findElement(By.xpath("//span[.='Upload Resume']")).click();
       String xp = "//input[@id=\"file-upload\"]";
     d.findElement(By.xpath(xp)).sendKeys("E:\\resumee\\Syed.doc");
	}

}
