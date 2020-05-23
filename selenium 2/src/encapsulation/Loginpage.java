package encapsulation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	@FindBy(xpath="//input[@id='email']")
	private WebElement untb;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement unpw;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginbtn;
	
	public void setusername(String un) {
		untb.sendKeys(un);
	}
	public void setpassword(String pw) {
		unpw.sendKeys(pw);
	}
	public void clicklogin() {
	loginbtn.click(); 
       }
 	}
