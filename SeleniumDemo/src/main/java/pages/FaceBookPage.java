package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;

import utils.WaitUtil;

public class FaceBookPage {
	
	WebDriver driver;
	WaitUtil waitutil;
	
	public FaceBookPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='btn btn-primary windowSingle']") WebElement likeUsOnFacebook;
	@FindBy(xpath = "//div[@class='xjbqb8w x1iyjqo2 x193iq5w xeuugli x1n2onr6']/child::input[@name='email']") WebElement emailfield;
	@FindBy(xpath = "//div[@class='x1c436fg']/child::div[@class='x78zum5 xdt5ytf xh8yej3']/descendant::input") WebElement passwordfield;
	@FindBy(xpath = "//div[@class='x1c436fg']/descendant::span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft x1j85h84']")
	WebElement loginButton;	
	@FindBy(xpath = "//div[@aria-label='Close']/i") WebElement closeButton;
	@FindBy(xpath = "//h1[contains(text(),'Obsqura Zone')]") WebElement obsquraZoneText;

	public void clickFacebook()
	{
		likeUsOnFacebook.click();
	}
	
	public void enterEmail(String email)
	{
		waitutil= new WaitUtil(driver);
		waitutil.implicitWait(50);
		emailfield.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		passwordfield.sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();		
	}
	
	public void clickCloseButton()
	{
		waitutil= new WaitUtil(driver);
		waitutil.implicitWait(50);
		closeButton.click();
	}
	
	public String getText()
	{
		String PageText= obsquraZoneText.getText();
		//System.out.println(PageText);
		return PageText;
	}
}
