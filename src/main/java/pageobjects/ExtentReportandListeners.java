package pageobjects;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import resources.BaseClass;
import resources.ExtentReportClass;



public class ExtentReportandListeners extends BaseClass implements ITestListener {
	ExtentTest test;
	
	ExtentReports extents=ExtentReportClass.getextentreport();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
