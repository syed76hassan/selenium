package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/SYED%20HASSAN/Desktop/demo1.html");
		List<WebElement> links = d.findElements(By.tagName("a"));
		System.out.println(links.size());
		WebElement link2 = links.get(1);
		link2.click();
	System.out.println(link2.getText());
	}

}
