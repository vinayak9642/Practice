package AutoBots.Resourses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import AutoBots.Utilities.ExtentReportsCheck;


public class Listerners extends BaseClass implements ITestListener{

	ExtentTest test ;
	ExtentReports ex = ExtentReportsCheck.getReport();
 
	@Override
	public void onTestStart(ITestResult res)
	{
	//test =ex.createTest(res.getMethod().getMethodName());
	test = ex.createTest(res.getMethod().getMethodName());
	
	
	}
	@Override
	public void onStart(ITestContext res)
	{
	}
	@Override
	public void onFinish(ITestContext res)
	{
		ex.flush();
	}
	// Run when the test case passed successfully
	@Override
	public void onTestSuccess(ITestResult res)
	{
	test.log(Status.PASS, "Passed successfully");
	System.out.println("pass iyendi ra babu");
	}
	// Run when the test case fails
	@Override
	public void onTestFailure(ITestResult res)
	{
	test.log(Status.FAIL, " Test failed ");
//	
//	try {
//		driver = (WebDriver) res.getTestClass().getRealClass().getField("driver").get(res.getInstance());
//	} catch (IllegalArgumentException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (IllegalAccessException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (NoSuchFieldException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (SecurityException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	String Filepath;
//	try {
//		Filepath = ScreenShot(driver,res.getMethod().getMethodName());
//		test.addScreenCaptureFromPath(Filepath,res.getMethod().getMethodName());
//	} catch (IOException e) {
//		
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	
	}
	// Run when test case pass with some failures
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult res)
	{
	System.out.println("Test case passed with failure is "+res.getName());
	}
	// Run when the test case is skipped
	@Override
	public void onTestSkipped(ITestResult res)
	{
	System.out.println("Test case skipped is :"+res.getName());
	}
	}
