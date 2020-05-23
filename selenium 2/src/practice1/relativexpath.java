package practice1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.photoeditor.com/");
		File f = new File("./photo/ss1.png");
		String p = f.getAbsolutePath();
		System.out.println(p);
		d.findElement(By.xpath("//button[@class='btn btn-outline-info']")).sendKeys(p);
	}

}
