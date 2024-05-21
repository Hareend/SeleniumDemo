package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.DriverIntializer;
import pages.HomePage;
import pages.SimpleForm;
import utils.PropertyReaderUtil;
import utils.ReportUtil;
import utils.ScreenshotUtil;

public class SimpleFormTest extends DriverIntializer{

	WebDriver driver;
	HomePage homepage;
	SimpleForm simpleform;
	ScreenshotUtil screenshot;
//	ReportUtil reportutil;
	
	
	@Test(priority=1)
	public void simpleFormPage() throws IOException
	{
		//try {
			//System.out.println(PropertyReaderUtil.getproperty("URL"));
		//} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		driver = getDriver();
		homepage = new HomePage(driver);
		homepage.InputFormClick();
		simpleform = new SimpleForm(driver);
		simpleform.EnterMessage();
		String result =simpleform.ShowMessage();
		simpleform.YourMessage();
		simpleform.ValueA();
		simpleform.ValueB();
		simpleform.GetTotal();
		simpleform.TotalDisplay();
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("Your Messagee : "+result,"Hello");
		
		screenshot= new ScreenshotUtil();
		screenshot.TakeScreenshot(driver,"SimpleInputFormPage");
		
	/*	reportutil= new ReportUtil();
		reportutil.generateReports();
		reportutil.verifygenerateReports();
		reportutil.createTest("Testing: Simple Form Test");
		reportutil.extenTestLogINFO();
		reportutil.extenTestLogPASS();
		reportutil.extenTestLogFAIL();
		//reportutil.extenReportFLUSH();*/
		
	}
}
