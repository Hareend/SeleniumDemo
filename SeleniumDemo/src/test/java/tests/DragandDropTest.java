package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.DragandDrop;
import pages.HomePage;
import utils.ReportUtil;
import utils.ScreenshotUtil;

public class DragandDropTest extends DriverIntializer{
	
	WebDriver driver;
	Actions action;
	HomePage homepage;
	ScreenshotUtil screenshot;
	//ReportUtil reportutil;
	DragandDrop dragandrop;
	
	@Test
	public void dragNDropPage() throws IOException, InterruptedException
	{
		driver = getDriver();
		homepage = new HomePage(driver);
		homepage.OthersClick();
		Thread.sleep(5000);
		dragandrop = new DragandDrop(driver);
		dragandrop.dragNDropElement();
		Thread.sleep(6000);
		
		screenshot= new ScreenshotUtil();
		screenshot.TakeScreenshot(driver,"DragNDrop");
		
	/*	reportutil= new ReportUtil();
		reportutil.generateReports();
		reportutil.verifygenerateReports();
		reportutil.createTest("Testing: Drag and Drop Page");
		reportutil.extenTestLogINFO();
		reportutil.extenTestLogPASS();
		reportutil.extenTestLogFAIL();
		//reportutil.extenReportFLUSH();*/
	}

}
