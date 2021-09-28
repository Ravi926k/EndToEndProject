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

	ExtentReports extents = ExtentReportClass.getextentreport();
	ThreadLocal<ExtentTest> extenttest = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		
		test=extents.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		

	}

	public void onTestFailure(ITestResult result) {
		

	}

	public void onTestSkipped(ITestResult result) {
		

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		

	}

	public void onStart(ITestContext context) {
		

	}

	public void onFinish(ITestContext context) {
		

	}
}
