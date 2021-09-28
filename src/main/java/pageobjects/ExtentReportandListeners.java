package pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.BaseClass;
import resources.ExtentReportClass;

public class ExtentReportandListeners extends BaseClass implements ITestListener {
	ExtentTest test;

	ExtentReports extents = ExtentReportClass.getextentreport();
	ThreadLocal<ExtentTest> extenttest = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		
		test=extents.createTest(result.getMethod().getMethodName());
		extenttest.set(test);

	}

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS, "Test case passed");

	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().fail(result.getThrowable());
		WebDriver driver=null;
		String testmethodname=result.getMethod().getMethodName();
		
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			
			extenttest.get().addScreenCaptureFromPath(getscreenshot(testmethodname, driver), result.getMethod().getMethodName());
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		

	}

	public void onStart(ITestContext context) {
		

	}

	public void onFinish(ITestContext context) {
		extents.flush();

	}
}
