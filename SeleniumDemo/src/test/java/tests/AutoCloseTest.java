package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.AlertsAndModals;
import pages.HomePage;
import pages.JavaScriptAlert;
import utils.ScreenshotUtil;
import pages.AutoClosable;

public class AutoCloseTest extends DriverIntializer{
	
	WebDriver driver;
	HomePage homePage;
	AlertsAndModals alertsAndModals;
	AutoClosable autoclosable;
	ScreenshotUtil screenshot;
	String exp_Text="Obsqura Zone ";
	String exp_Message="I'm a normal success message. To close use  the appropriate button.";
	boolean compare;
	
	@Test(priority = 1)
	public void verifyNormalSuccessMessageDisplay() throws IOException
	{
		driver=getDriver();
		homePage= new HomePage(driver);
		homePage.AlertsAndModalsClick();
		autoclosable=new AutoClosable(driver);
		autoclosable.clickSuccessButton();
		String act_Message=autoclosable.SuccessMessage();
		compare= act_Message.contains(act_Message);		
		Assert.assertEquals(compare,true);
		screenshot= new ScreenshotUtil();
		screenshot.TakeScreenshot(driver,"AutoClosable");
		
	}
	

}
