package AutoBots.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsCheck {
	
	ExtentTest test ;
	static ExtentReports ex ; 
	
	
	public static  ExtentReports  getReport()  {
		
	String path = System.getProperty("user.dir")+"//reports//myreport//report.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	
	reporter.config().setReportName("Karthik");
	reporter.config().setDocumentTitle("Test result");
	
	ex = new ExtentReports();
	ex.attachReporter(reporter);
	ex.setSystemInfo("Tester name", "Karthik");
	return ex;
	
	}
	

}
