package xl_reading;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class st {

	public static String GetPhoto(WebDriver d, String folder) {
		String path="";
		String dd = new Date().toString();
		String datetime = dd.replace(':', '-');
		
		path=folder+datetime+".png";
		
		TakesScreenshot t=((TakesScreenshot)d);
		File src = t.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src,new File(path));
		} catch (Exception e) {
		
		}
			return path;
		
	}
}
