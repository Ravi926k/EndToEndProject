package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportClass {
	
	static ExtentReports extents;
	
	public static ExtentReports getextentreport() {
		
		String reportpath=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportpath);
		
		reporter.config().setReportName("Ravi Test Report");
		reporter.config().setDocumentTitle("Test results");
		
		extents=new ExtentReports();
		extents.attachReporter(reporter);
		extents.setSystemInfo("Tester", "Ravichandran");
		
		
		
		return extents;
		
		
	}

}
