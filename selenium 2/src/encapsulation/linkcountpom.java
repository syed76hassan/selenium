package encapsulation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class linkcountpom {
  @FindBy(xpath="//a")
		  private List<WebElement> alllinks;
  
  public linkcountpom(WebDriver d) {
	  PageFactory.initElements(d, this);
  }
  
  public void count() {
	System.out.println(alllinks.size());
  }
  
  
  
}
