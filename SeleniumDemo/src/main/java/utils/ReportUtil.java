package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportUtil {
	ExtentTest extentTest;
	private static ExtentReports extentReports = new ExtentReports();
	
	public ExtentReports generateReports(){
        String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Test Automation Results");
        htmlReporter.config().setTheme(Theme.STANDARD);
         ExtentReports extentReports = new ExtentReports();
         extentReports.attachReporter(htmlReporter);
         return extentReports;
     }
	
	
	public void verifygenerateReports()
	{
		extentReports=generateReports();
	}
	
	public void createTest(String testReportName)
	{
		extentTest= extentReports.createTest(testReportName);
	}
	
	public void extenTestLogINFO()
	{
		extentTest.log(Status.INFO, "Entering Test");
	}
	
	public void extenTestLogPASS()
	{
		extentTest.log(Status.PASS, "Test Passed");
	}
	
	
	
	public void extenTestLogFAIL()
	{
		extentTest.log(Status.FAIL, "Test Fail");
	}
	
	public void extenTestLogWARNING()
	{
		extentTest.log(Status.WARNING, "Test Warning");
	}
	
	public void extenReportFLUSH()
	{
		extentReports.flush();
	}


}
