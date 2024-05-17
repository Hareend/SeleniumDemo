package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaScriptAlert {
	
	WebDriver driver;
	
	public JavaScriptAlert(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class='btn btn-success']") WebElement successbutton;		
	@FindBy(xpath = "//button[@class='btn btn-warning']") WebElement warningbutton;
	@FindBy(xpath = "//button[@class='btn btn-danger']") WebElement dangerbutton;
	
	public void successbutton()
	{
		successbutton.click();
	}
	
	public void warningbutton()
	{
		warningbutton.click();
	}
	
	public void dangerbutton()
	{
		dangerbutton.click();
	}
	
	public String getTextJavaScriptAlertBox()
	{
		Alert alert1= driver.switchTo().alert(); 
		String javaScriptAlertText=alert1.getText(); 
		return javaScriptAlertText;		
	}
	
	public void closeJavaScriptAlertBox()
	{
		Alert alert1= driver.switchTo().alert(); 
		String alertext=alert1.getText(); 
		alert1.accept(); 
	}
}
