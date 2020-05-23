package xl_reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class program2 {

	public static void main(String[] args) throws InvalidFormatException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String xpath="./data/data.xlsx";
		String sheet="valid login";
		
		Workbook w = WorkbookFactory.create(new FileInputStream(xpath));
		String v = w.getSheet(sheet).getRow(1).getCell(0).toString();
		System.out.println(v);
	}

}
