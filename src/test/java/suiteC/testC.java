package suiteC;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;
import testBase.TestBase;

public class testC extends TestBase {

	@Test
	public void CtestC() {
		log("Starting the browsser", "info");
		log("Test passed","Pass");

	}

}
