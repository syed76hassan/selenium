package practice1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
        d.get("file:///C:/Users/SYED%20HASSAN/Desktop/selinium%202%20se/xp.html");
        WebElement e = d.findElement(By.xpath("//input[@value='reset']"));
        e.click();
       TakesScreenshot t=(TakesScreenshot)d;
       File srcfile = t.getScreenshotAs(OutputType.FILE);
       File destfile = new File("./photo/ss.png");
       FileUtils.copyFile(srcfile, destfile);
       d.close();
       
	}

}
