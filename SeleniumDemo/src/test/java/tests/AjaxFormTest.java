package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.AjaxForm;
import pages.FormSubmit;
import pages.HomePage;
import pages.InputForm;
import utils.ReportUtil;
import utils.ScreenshotUtil;

public class AjaxFormTest extends DriverIntializer{
	
	WebDriver driver;
	HomePage homepage;
	InputForm inputform;
	ScreenshotUtil screenshot;
	ReportUtil reportutil;
	AjaxForm ajaxform;
	
	String expected_Message="Form has been submitted successfully!";
	@Test
	public void verifyajaxform() throws IOException 
	{
		driver = getDriver();
		homepage = new HomePage(driver);
		homepage.InputFormClick();
		inputform = new InputForm(driver);
		ajaxform = new AjaxForm(driver);
		inputform.AjaxFormSubmit();
		ajaxform.subject("Test Subject Value");
		ajaxform.description("Test Description");
		ajaxform.ajaxsubmit();
		String actual_message=ajaxform.successmessage();
		Assert.assertEquals(actual_message, expected_Message);
		System.out.println("Expected & Actual message is same!!!");
		
		screenshot= new ScreenshotUtil();
		screenshot.TakeScreenshot(driver,"AjaxFormPage");
		
		reportutil= new ReportUtil();
		reportutil.generateReports();
		reportutil.verifygenerateReports();
		reportutil.createTest("Testing: Simple Form Test");
		reportutil.extenTestLogINFO();
		reportutil.extenTestLogPASS();
		reportutil.extenTestLogFAIL();
		//reportutil.extenReportFLUSH();
	}
}
