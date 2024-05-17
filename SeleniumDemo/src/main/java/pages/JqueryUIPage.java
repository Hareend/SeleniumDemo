package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WaitUtil;

public class JqueryUIPage {
	
WebDriver driver;
WaitUtil waitutil;
	
	public JqueryUIPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="downloadButton") WebElement downloadbutton;
	@FindBy(xpath = "//button[@class='ui-button ui-corner-all ui-widget' and text()='Close']") WebElement closebutton;
	
	public void downloadbutton()
	{
		downloadbutton.click();
	}
	
	
	public void closebutton()
	{
		waitutil= new WaitUtil(driver);
		waitutil.explicitWaitVisibilityOfPageElement(closebutton);
		closebutton.click();
	}

}
