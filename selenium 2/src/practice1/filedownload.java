package practice1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class filedownload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stubSy
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
//		WebDriver d=new ChromeDriver();
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.selenium.dev/downloads/");
		d.findElement(By.xpath("//td[.='Java']/../td[6]/a[.='Download']")).click();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);

		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
