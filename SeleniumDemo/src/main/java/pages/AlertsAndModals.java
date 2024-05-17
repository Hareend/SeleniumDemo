package pages;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsAndModals 
{

	WebDriver driver;
	
	public AlertsAndModals(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(@href,'bootstrap-alert.php')]") WebElement Bootstrap;
	@FindBy(xpath = "//a[contains(@href,'bootstrap-modal.php')]") WebElement BootstrapModal;
	@FindBy(xpath = "//a[contains(@href,'window-popup.php')]") WebElement Windowpopup;
	@FindBy(xpath = "//a[contains(@href,'bootstrap-modal-progress.php')]") WebElement Modalprogress;
	@FindBy(xpath = "//a[contains(@href,'javascript-alert.php')]") WebElement JavascriptAlert;
	@FindBy(xpath = "//a[contains(@href,'file-download.php')]") WebElement Filedownloadpage;
	
	public void Bootstrap()
	{
		Bootstrap.click();
	}
	
	public void BootstrapModal()
	{
		BootstrapModal.click();
	}
	
	public void Windowpopup()
	{
		Windowpopup.click();
	}
	
	public void Modalprogress()
	{
		Modalprogress.click();
	}
	
	public void JavascriptAlert()
	{
		JavascriptAlert.click();
	}
	
	public void Filedownloadpage()
	{
		Filedownloadpage.click();
	}
}
