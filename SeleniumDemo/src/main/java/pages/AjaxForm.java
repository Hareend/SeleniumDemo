package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WaitUtil;

public class AjaxForm {
	WebDriver driver;
	WaitUtil waitutil;
	
	public AjaxForm(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="subject") WebElement subject;
	@FindBy(id="description") WebElement description;
	@FindBy(xpath = "//input[@value=\"Submit\"]") WebElement submit;
	@FindBy(id = "message-one") WebElement success;
	@FindBy(xpath = "//div[contains(text(),'Form has been submitted successfully!')]")	WebElement finalMessage;

	public void subject(String sub) 
	{
		subject.clear();
		subject.sendKeys(sub);
	}
	
	public void description(String descrp)
	{
		description.clear();
		description.sendKeys(descrp);
	}
	
	public void ajaxsubmit()
	{
		submit.sendKeys(Keys.ENTER);
	}
	public String successmessage()
	{
		waitutil=new WaitUtil(driver);
		waitutil.fluentWaitTextToBePresentInElement(success, "Form has been submitted successfully!");		
		String actualMessage=success.getText();
		return actualMessage;
	}
}
