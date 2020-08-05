package suiteB;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class testBB {
	ExtentReports report;
	ExtentTest test;
	@BeforeMethod
	public void init() {
		report=ExtentManager.getReport();
		test=report.createTest("testBB");
	}
	
	@AfterMethod
	public void quit() {
		report.flush();
	}

	@Test
	public void BBtestBB() {
		test.log(Status.INFO, "Starting the test");

	}
}
