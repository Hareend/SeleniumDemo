package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputForm {
WebDriver driver;
	
	public InputForm(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(@href,'simple-form-demo.php')]")
	WebElement SimpleFormDemo;
	
	@FindBy(xpath = "//a[contains(@href,'check-box-demo.php')]")
	WebElement CheckboxDemo;
	
	@FindBy(xpath = "//a[contains(@href,'radio-button-demo.php')]")
	WebElement RadioButtonsDemo;
	
	@FindBy(xpath = "//a[contains(@href,'select-input.php')]")
	WebElement SelectInput;
	
	@FindBy(xpath = "//a[contains(@href,'form-submit.php')]")
	WebElement FormSubmit;
	
	@FindBy(xpath = "//a[contains(@href,'ajax-form-submit.php')]")
	WebElement AjaxFormSubmit;
	
	@FindBy(xpath = "//a[contains(@href,'jquery-select.php')]")
	WebElement JquerySelect;
	
	public void SimpleFormDemo()
	{
		SimpleFormDemo.click();
	}
	
	public void CheckboxDemo() 
	{
		CheckboxDemo.click();
	}
	
	public void RadioButtonsDemo() 
	{
		RadioButtonsDemo.click();
	}
	
	public void SelectInput() 
	{
		SelectInput.click();
	}
	
	public void FormsSubmit() 
	{
		FormSubmit.click();
	}
	
	public void AjaxFormSubmit() 
	{
		AjaxFormSubmit.click();
	}
	
	public void JquerySelect() 
	{
		JquerySelect.click();
	}

}
