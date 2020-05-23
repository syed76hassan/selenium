package ENCAP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(xpath="//input[@id=\"username\"]")
	private WebElement untb;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwtb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbtn;
	
	public Loginpage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
			
	public void login(String un,String pw) {
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
	    loginbtn.click();
	}
	
	
}
