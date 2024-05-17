package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleForm {
	WebDriver driver;
	
	public SimpleForm(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "single-input-field") WebElement EnterMessage;
	@FindBy(xpath = "//button[@id='button-one']") WebElement ShowMessage;
	@FindBy(id = "message-one") WebElement YourMessage;
	@FindBy(id = "value-a") WebElement ValueA;
	@FindBy(id = "value-b") WebElement ValueB;
	@FindBy(xpath = "//button[@id='button-two']") WebElement GetTotal;
	@FindBy(xpath = "message-two") WebElement TotalDisplay;
	
	public void EnterMessage()
	{
		String message = "Hello";
		EnterMessage.sendKeys(message);
	}
	
	public String ShowMessage() 
	{
		ShowMessage.click();
		return null;
	}
	
	public void YourMessage()
	{
		System.out.println("Your Message: "+ShowMessage);
	}
	
	public void ValueA() 
	{
		ValueA.sendKeys("100");
	}
	
	public void ValueB()
	{
		ValueB.sendKeys("50");
	}
	
	public void GetTotal()
	{
		GetTotal.click();
	}
	
	public void TotalDisplay()
	{
		System.out.println("Total A +B: "+GetTotal);
	}

}
