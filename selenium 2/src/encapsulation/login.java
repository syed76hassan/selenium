package encapsulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login{
	
	private WebElement untb;
	private WebElement pwtb;
	private WebElement loginbtn;
	
	public login(WebDriver d) {
		untb=d.findElement(By.xpath("//input[@id='email']"));
		pwtb=d.findElement(By.xpath("//input[@id='pass']"));
		loginbtn=d.findElement(By.xpath("//input[@type='submit']"));
	}
	
	public void setusername(String un) {
		untb.sendKeys(un);
	}
	public void setpassword(String pw) {
		pwtb.sendKeys(pw);
	}
	public void clickbtn(){
		loginbtn.click();
	} 
		
	

	
}
class demoo{
	  static {
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  }
	  public static void main(String[] args) {
 			// TODO Auto-generated method stub
          WebDriver d=new ChromeDriver();
          d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          d.get("https://www.facebook.com/");
          login l=new login(d);
          l.setusername("ysed");
          l.setpassword("1234");
          l.clickbtn();
		}

}