package suiteA;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import dataProviders.TestDataProvider;
import reports.ExtentManager;
import testBase.TestBase;

public class testA extends TestBase  {

	@Test(dataProviderClass = TestDataProvider.class,dataProvider ="getSuiteAData")
	public void AtestA(String name,String country,int number) {
		
		log("Starting the browsser", "info");
		log("Test passed","Pass");
		//System.out.println("Hello shivani how are you");
		System.out.println(name+country+number);
		
		
	}
}
