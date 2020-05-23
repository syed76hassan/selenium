package xl_reading;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static String Getvalue(String path,String sheet,int r,int c) {
		String v="";
		try {
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e) {			
		}
		return v;	
	}

	public static int GetRowNum(String path,String sheet) {
		int cc=0;
		try {
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		cc=wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e) {
		}
		return cc;
	}
	
	public static int GetColNum(String path,String sheet,int r) {
		int vv=0;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			vv=wb.getSheet(sheet).getRow(r).getLastCellNum();
		}
		catch(Exception e) {		
		}
		return vv;
	}
	}

