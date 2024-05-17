package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.HomePage;
import pages.JqueryUIPage;
import utils.ReportUtil;
import utils.ScreenshotUtil;


public class JqueryUITest extends DriverIntializer{
	
	WebDriver driver;
	HomePage homepage;
	JqueryUIPage jqueryui;
	ReportUtil reportutil;
	ScreenshotUtil screenshot;
	
	
	@Test
	public void verifyJquerypage() throws IOException
	{
		driver = getDriver();
		homepage = new HomePage(driver);
		homepage.ProgressBarsClick();
		jqueryui = new JqueryUIPage(driver);
		jqueryui.downloadbutton();
		jqueryui.closebutton();
		
		screenshot= new ScreenshotUtil();
		screenshot.TakeScreenshot(driver,"JqueryPage");
		
		reportutil= new ReportUtil();
		reportutil.generateReports();
		reportutil.verifygenerateReports();
		reportutil.createTest("Testing: Jquery Form Test");
		reportutil.extenTestLogINFO();
		reportutil.extenTestLogPASS();
		reportutil.extenTestLogFAIL();
		//reportutil.extenReportFLUSH();
	}

}
