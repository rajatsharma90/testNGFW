package testBase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class TestBase {

	ExtentReports report;
	ExtentTest test;
	
	@BeforeMethod
	public void init(ITestResult result) {
		report=ExtentManager.getReport();
		//System.out.println(result.getMethod().getMethodName().toUpperCase());
		test=report.createTest(result.getMethod().getMethodName().toUpperCase());
	}
	
	@AfterMethod
	public void quit() {
		report.flush();
	}
	
	public void log(String Message,String type) {
		try {
		if (type.equalsIgnoreCase("info")){
			test.log(Status.INFO, Message);
		}
		else if (type.equalsIgnoreCase("Pass")) {
			test.log(Status.PASS, Message);
		}
		else if (type.equalsIgnoreCase("fail")) {
			test.log(Status.FAIL, Message);
		}
		else if (type.equalsIgnoreCase("skip")) {
			test.log(Status.SKIP, Message);
		}
		}
		catch (Exception e) {
			System.out.println("Type is incorrect");
		}
		}
		
	}


