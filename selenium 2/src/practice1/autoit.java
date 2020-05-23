package practice1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autoit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
//		WebDriver d=new FirefoxDriver();
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://smallpdf.com/word-to-pdf");
		d.findElement(By.xpath("//span[.='Choose Files']")).click();
		ProcessBuilder pb=new ProcessBuilder("C:\\Users\\SYED HASSAN\\Desktop\\f4.exe");
		pb.start();

	}

}
