package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RadioButtons {
	WebDriver driver;
	
	public RadioButtons(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//label[contains(text(),'Male')]/preceding-sibling::input") WebElement Male;
	@FindBy(id = "inlineRadio2") WebElement Female;
	@FindBy(xpath = "//button[@id='button-one']") WebElement ShowSelectedValue;
	@FindBy(id = "//*[@id=\\\"message-one\\\"]") WebElement RadioButton;
	@FindBy(id = "message-two")	WebElement messageText;	
	
	public void Male()
	{
		Male.click();
	}
	
	public void ShowSelectedValue()
	{
		ShowSelectedValue.click();
	}
	
	public void RadioButton()
	{
		String value = driver.findElement(By.id("message-one")).getText();
		//System.out.println(value);		
		//Assert.assertEquals("Radio button 'Male' is checked", value);
	}
	
	public String getMessage()
	{
		String messageTest= messageText.getText();
		return messageTest;
		
	}

}
