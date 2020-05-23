package practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("https://www.google.com/");
		d.findElement(By.xpath("//input[@title='Search']")).sendKeys("java");
		List<WebElement> alls = d.findElements(By.xpath("//span[contains(text(),'java')]"));
		System.out.println(alls.size());
		for(int i=0;i<alls.size();i++) {
			WebElement link = alls.get(i);
			System.out.println(link.getText());
		}
	}

}
