package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.AlertsAndModals;
import pages.HomePage;
import pages.JavaScriptAlert;
import utils.ReportUtil;
import utils.ScreenshotUtil;

public class JavaScriptAlertTest extends DriverIntializer
{
	WebDriver driver;
	HomePage homePage;
	AlertsAndModals alertsAndModals;
	JavaScriptAlert javaScriptAlert;
	ScreenshotUtil screenshot;
//	ReportUtil reportutil;
	
	static String expectedValue_AlertBox="I am a Javascript alert box!";
	static String expectedValue_PromptBox="Please enter your name";
	
	@Test(priority = 1)
	public void javaScriptAlertBox() throws IOException
	{
		driver=getDriver();
		homePage=new HomePage(driver);
		homePage.AlertsAndModalsClick();
		alertsAndModals= new AlertsAndModals(driver);
		alertsAndModals.JavascriptAlert();
		javaScriptAlert=new JavaScriptAlert(driver);
		javaScriptAlert.dangerbutton();
		String actualValue=javaScriptAlert.getTextJavaScriptAlertBox();
		Assert.assertEquals(actualValue, expectedValue_PromptBox);
		System.out.println("Expected & Actual message is same!!!");
		javaScriptAlert.closeJavaScriptAlertBox();
		
		screenshot= new ScreenshotUtil();
		screenshot.TakeScreenshot(driver,"JavascriptAlert");
		
	/*	reportutil= new ReportUtil();
		reportutil.generateReports();
		reportutil.verifygenerateReports();
		reportutil.createTest("Testing: Javascript Alert Page");
		reportutil.extenTestLogINFO();
		reportutil.extenTestLogPASS();
		reportutil.extenTestLogFAIL();
		//reportutil.extenReportFLUSH();*/
	}
}
