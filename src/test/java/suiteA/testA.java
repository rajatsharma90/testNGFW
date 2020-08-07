package suiteA;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import org.testng.Assert;
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
		
		log("Starting the browser");
		softAssert.assertEquals(21111111, 21111111,"Both are equal");
//		if((12==23)==false) {
//			softAssert("Incorrect 12!=23");
//		}
//		
//		//System.out.println("Hello shivani how are you");
//		//sa.assertEquals(3, 4);
//		System.out.println(name+country+number);
//		if(!"ab".equals("bb")) {
//			softAssert("both title are not equal");
//		}
//		
//		//sa.fail("failed by soft asset");
		softAssert.assertAll();


		
		
	}
}
