package testBase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class TestBase {


	public ExtentReports report;
	public ExtentTest test;
	public SoftAssert softAssert;

	@BeforeMethod
	public void init(ITestResult result) {
		report=ExtentManager.getReport();
		softAssert =new SoftAssert();
		//System.out.println(result.getMethod().getMethodName().toUpperCase());
		test=report.createTest(result.getMethod().getMethodName().toUpperCase());
		result.setAttribute("reporter", test);
	}

	@AfterMethod
	public void quit() {
		report.flush();
	}

	public void log(String Message) {
		test.log(Status.INFO, Message);		
	}

	public void logFailure(String Message) {
		test.log(Status.FAIL, Message);		
	}

	public void softAssert(String Message) {
		logFailure(Message);
		softAssert.fail(Message);
	}

	public void AssertStop(String Message) {
		logFailure(Message);
		softAssert.fail(Message);
		softAssert.assertAll();
	}



}


