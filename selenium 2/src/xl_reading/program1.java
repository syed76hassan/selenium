package xl_reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InvalidFormatException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		String path="./data/data.xlsx";
		String sheet="valid login";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String v = wb.getSheet(sheet).getRow(1).getCell(1).toString();
		System.out.println(v);
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		
		String f="./photo/";
		st.GetPhoto(d, f);

	}

}
