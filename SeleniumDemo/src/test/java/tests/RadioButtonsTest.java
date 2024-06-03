package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.HomePage;
import pages.InputForm;
import pages.RadioButtons;
import utils.ReportUtil;
import utils.ScreenshotUtil;

public class RadioButtonsTest extends DriverIntializer {
	
	WebDriver driver;
	HomePage homepage;
	RadioButtons radiobuttons;
	InputForm inputform;
	ScreenshotUtil screenshot;
	//ReportUtil reportutil;
	
	@Test(priority=2)
	public void radioButtonPage() throws IOException
	{
		driver = getDriver();
		homepage = new HomePage(driver);
		inputform = new InputForm(driver);
		radiobuttons = new RadioButtons(driver);
		homepage.InputFormClick();
		inputform.RadioButtonsDemo();
		radiobuttons.Male();
		radiobuttons.ShowSelectedValue();
		radiobuttons.RadioButton();
		String actualMaleGenderMessage= radiobuttons.getMessage();
		System.out.println(actualMaleGenderMessage);
		//boolean actual_Male= actualMaleGenderMessage.contains("Gender : Male");
		//Assert.assertEquals(actual_Male, true);
		screenshot= new ScreenshotUtil();
		screenshot.TakeScreenshot(driver,"Radio_Button");
		
	/*	reportutil= new ReportUtil();
		reportutil.generateReports();
		reportutil.verifygenerateReports();
		reportutil.createTest("Testing: Radio Button Test");
		reportutil.extenTestLogINFO();
		reportutil.extenTestLogPASS();
		reportutil.extenTestLogFAIL();
		//reportutil.extenReportFLUSH();*/
		
	}

}
