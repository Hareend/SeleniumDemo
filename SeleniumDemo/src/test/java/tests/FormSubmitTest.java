package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.FormSubmit;
import pages.HomePage;
import pages.InputForm;
import pages.RadioButtons;
import utils.ReportUtil;
import utils.ScreenshotUtil;

public class FormSubmitTest extends DriverIntializer{

	WebDriver driver;
	HomePage homepage;
	RadioButtons radiobuttons;
	InputForm inputform;
	ScreenshotUtil screenshot;
	ReportUtil reportutil;
	FormSubmit formsubmit;
	String expectedMessage= "Form has been submitted successfully!";
	String expectedCheckBoxValidationMessage="You must agree before submitting.";
	
	@Test(priority=1)
	public void verifyformsubmit() throws IOException
	{
		driver = getDriver();
		homepage = new HomePage(driver);
		homepage.InputFormClick();
		inputform = new InputForm(driver);
		formsubmit= new FormSubmit(driver);
		inputform.FormsSubmit();
		formsubmit.firstname("Hareend");
		formsubmit.lastname("R U");
		formsubmit.username("hareend");
		formsubmit.city("Trivandrum");
		formsubmit.state("Kerala");
		formsubmit.zip("695021");
		formsubmit.agreeclick();
		formsubmit.submitclick();
		String actualMessage= formsubmit.displaySubmittedSuccessfullyMessage();
		Assert.assertEquals(actualMessage, expectedMessage);
		System.out.println("FormSubmit page verification is completed");
		
		screenshot= new ScreenshotUtil();
		screenshot.TakeScreenshot(driver,"FormSubmitPage");
		
		reportutil= new ReportUtil();
		reportutil.generateReports();
		reportutil.verifygenerateReports();
		reportutil.createTest("Testing: Form Submit Page");
		reportutil.extenTestLogINFO();
		reportutil.extenTestLogPASS();
		reportutil.extenTestLogFAIL();
		reportutil.extenReportFLUSH();
		
	}
	
	@Test(priority = 2)
	public void verifyFormSubmit_CheckBoxValidationMessageDisplay() throws IOException
	{
		inputform.FormsSubmit();
		formsubmit=new FormSubmit(driver);
		formsubmit.firstname("Hareend");
		formsubmit.lastname("R U");
		formsubmit.username("hareend");
		formsubmit.city("Trivandrum");
		formsubmit.state("Kerala");
		formsubmit.zip("695021");
		formsubmit.submitclick();
		String actualCheckBoxValidationMessage= formsubmit.displaycheckboxValidationMessage();
		Assert.assertEquals(actualCheckBoxValidationMessage, expectedCheckBoxValidationMessage);
		System.out.println("CheckBox Validation is Successfully Completed");	
		screenshot= new ScreenshotUtil();
		screenshot.TakeScreenshot(driver,"FormSubmit_CheckBoxValidationMessageDisplay");
		
		reportutil= new ReportUtil();
		reportutil.generateReports();
		reportutil.verifygenerateReports();
		reportutil.createTest("Testing: FormSubmit_CheckBoxValidationMessageDisplay");
		reportutil.extenTestLogINFO();
		reportutil.extenTestLogPASS();
		reportutil.extenTestLogFAIL();
		//reportutil.extenReportFLUSH();
	}
}
