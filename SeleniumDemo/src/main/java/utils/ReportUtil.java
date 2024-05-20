package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportUtil implements ITestListener {
	ExtentTest extentTest;
	private static final ExtentReports extentReports = new ExtentReports();
	
	static{
        String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Test Automation Results");
        htmlReporter.config().setTheme(Theme.STANDARD);
         ExtentReports extentReports = new ExtentReports();
         extentReports.attachReporter(htmlReporter);
        // return extentReports;
     }
	
	
/*	public void verifygenerateReports()
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
	}*/
	
	@Override
	public void onTestStart(ITestResult result) {
	    // not implemented
	  }

	  /**
	   * Invoked each time a test succeeds.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS
	   */
	@Override
	  public void onTestSuccess(ITestResult result) {
	    // not implemented
	  }

	  /**
	   * Invoked each time a test fails.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#FAILURE
	   */
	@Override
	  public void onTestFailure(ITestResult result) {
	    // not implemented
	  }

	  /**
	   * Invoked each time a test is skipped.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SKIP
	   */
	@Override
	  public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	  /**
	   * Invoked each time a method fails but has been annotated with successPercentage and this failure
	   * still keeps it within the success percentage requested.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
	   */
	@Override
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	  /**
	   * Invoked each time a test fails due to a timeout.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   */
	@Override
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  /**
	   * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt;
	   * tag and calling all their Configuration methods.
	   *
	   * @param context The test context
	   */
	@Override
	  public void onStart(ITestContext context) {
	    // not implemented
	  }

	  /**
	   * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have
	   * run and all their Configuration methods have been called.
	   *
	   * @param context The test context
	   */
	@Override
	  public void onFinish(ITestContext context) {
	    // not implemented
	  }


}
