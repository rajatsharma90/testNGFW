package reports;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	static ExtentReports report;
	
	
	public static ExtentReports getReport() {
		if(report==null) {
			report=new ExtentReports();
			Date d=new Date();
			String folderName=d.toString().replace(" ", "_").replace(":", "_");
			String reportFolderpath=System.getProperty("user.dir")+"/report/"+folderName;
			String screenShotfolderPath=reportFolderpath+"/Screenshots/";
			File f= new File(screenShotfolderPath);
			f.mkdirs();
			ExtentSparkReporter reporter=new ExtentSparkReporter(reportFolderpath);
			reporter.config().setDocumentTitle("Automation report");
			reporter.config().setReportName("Test Reports");
			reporter.config().setTheme(Theme.DARK);
			report.attachReporter(reporter);
		}
		return report;

	}
}
