package Testng;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multiple {
	
	

	@Test
	@Parameters({"ip","browser"})
	public void run(String ip,String browser) {
		Reporter.log(ip + " " +browser,true);
	}
}
