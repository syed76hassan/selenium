package encapsulation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage1 {
	
	@FindBy(xpath="//input[@id=\"username\"]")
	private WebElement untb;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwtb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbtn;
	
	public void setusername(String un) {
		untb.sendKeys(un);
	}
	
	public void setpassword(String pw) {
		pwtb.sendKeys(pw);
	}
    
	public void clicklogin() {
		loginbtn.click();
	}
}
