package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.AlertsAndModals;
import pages.FaceBookPage;
import pages.HomePage;
import utils.ReportUtil;
import utils.ScreenshotUtil;
import utils.SwitchNewWindow;
import utils.WaitUtil;

public class FaceBookTest extends DriverIntializer{
	
	WebDriver driver;
	HomePage homePage;
	FaceBookPage facebook;
	AlertsAndModals alertandmodals;
	SwitchNewWindow switchnewwindow;
	ScreenshotUtil screenshot;
	//ReportUtil reportutil;
	String exptected_Text="Obsqura Zone ";
	WaitUtil waitutil;
	
	@Test(priority = 1)
	public void faceBookPage() throws IOException
	{
		driver=getDriver();
		homePage= new HomePage(driver);
		homePage.AlertsAndModalsClick();
		alertandmodals= new AlertsAndModals(driver);
		alertandmodals.Windowpopup();
		facebook= new FaceBookPage(driver);
		facebook.clickFacebook();
		switchnewwindow=new SwitchNewWindow(driver);		
		facebook.enterEmail("hareend@gmail.com");
		facebook.enterPassword("Password@123");
		//facebook.clickLoginButton();
		facebook.clickCloseButton();
		String actual_Text=facebook.getText();
		Assert.assertEquals(actual_Text, exptected_Text);
		
		screenshot= new ScreenshotUtil();
		screenshot.TakeScreenshot(driver,"FaceBookPage");
		
		
	/*	reportutil= new ReportUtil();
		reportutil.generateReports();
		reportutil.verifygenerateReports();
		reportutil.createTest("Report: FaceBookPage");
		reportutil.extenReportFLUSH();*/
	}

}
