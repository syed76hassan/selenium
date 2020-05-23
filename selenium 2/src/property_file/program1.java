package property_file;

import java.io.FileInputStream;
import java.util.Properties;

public class program1 {
	public static void main(String[] args) {
		Properties p=new Properties();
		try {
        p.load(new FileInputStream("./property/config.properties"));	
       String v = p.getProperty("url");
       System.out.println(v);
		}
		catch(Exception e) {
			
		}
	
	}	

}
