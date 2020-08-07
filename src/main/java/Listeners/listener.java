package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("Test Started is "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" Passed");
		ExtentTest test=(ExtentTest)result.getAttribute("reporter");
		test.log(Status.PASS, String.valueOf(result.getStatus()));

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" Failed");
		ExtentTest test=(ExtentTest)result.getAttribute("reporter");
		test.log(Status.FAIL, result.getThrowable().getMessage());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" Skipped");
		ExtentTest test=(ExtentTest)result.getAttribute("reporter");
		test.log(Status.SKIP, "Test Skipped and logged in report");

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}
	
	
	

}
