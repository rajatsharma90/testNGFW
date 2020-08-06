package dataProviders;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	
	@DataProvider
	public Object[][]getSuiteAData(Method m){
		Object[][]data=null;
		if(m.getName().equalsIgnoreCase("AtestA")) {
			data=new Object[3][3];
			data[0][0]="Rajat";
			data[0][1]="INDIA";
			data[0][2]=248421;
			
			data[1][0]="SHIVANI";
			data[1][1]="US";
			data[1][2]=248420;
			
			data[2][0]="USHA";
			data[2][1]="INDIA";
			data[2][2]=64611;	
		}
		else if (m.getName().equalsIgnoreCase("AAtestAA")) {
			data=new Object[3][3];
			data[0][0]="ROB";
			data[0][1]="INDIA";
			data[0][2]=248421;
			
			data[1][0]="HOB";
			data[1][1]="US";
			data[1][2]=248420;
			
			data[2][0]="JOB";
			data[2][1]="INDIA";
			data[2][2]=64611;
		}
		return data;
	}
	
	@DataProvider
	public Object[][]getSuiteBData(Method m){
		Object[][]data=null;
		if(m.getName().equalsIgnoreCase("btestb")) {
			data=new Object[3][3];
			data[0][0]="Rajat";
			data[0][1]="INDIA";
			data[0][2]=248421;
			
			data[1][0]="SHIVANI";
			data[1][1]="US";
			data[1][2]=248420;
			
			data[2][0]="USHA";
			data[2][1]="INDIA";
			data[2][2]=64611;	
		}
		else if (m.getName().equalsIgnoreCase("bbtestbb")) {
			data=new Object[3][3];
			data[0][0]="ROB";
			data[0][1]="INDIA";
			data[0][2]=248421;
			
			data[1][0]="HOB";
			data[1][1]="US";
			data[1][2]=248420;
			
			data[2][0]="JOB";
			data[2][1]="INDIA";
			data[2][2]=64611;
		}
		return data;
	}

}
