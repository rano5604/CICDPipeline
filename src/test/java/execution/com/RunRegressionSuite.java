package execution.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testcase.com.RegressionSuite;

public class RunRegressionSuite {
	
	RegressionSuite rsuite = new RegressionSuite();
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser Opened Successfully");
	}
	
	@Test
	public void executeTestCase1() {
		rsuite.testcase1();		
	}
	
	@Test
	public void executeTestCase2() {
		rsuite.testcase2();
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser Closed Successfully");
	}
	
}
