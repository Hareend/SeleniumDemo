package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormSubmit {
	WebDriver driver;
	
	public FormSubmit(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="validationCustom01") WebElement First_Name;
	@FindBy(id="validationCustom02") WebElement Last_Name;
	@FindBy(id="validationCustomUsername") WebElement User_Name;
	@FindBy(id="validationCustom03") WebElement City;
	@FindBy(id="validationCustom04") WebElement State;
	@FindBy(id="validationCustom05") WebElement Zip;
	@FindBy(id="invalidCheck") WebElement Agree;
	@FindBy(xpath = "//button[text()='Submit form']") WebElement Submit;
	@FindBy(id = "message-one") WebElement submittedSuccessfullyMessage;
	@FindBy(xpath = "//label[contains(@class,'form-check-label')]/following-sibling::div") WebElement checkboxValidationMessage;
	
	public void firstname(String fname)
	{
		First_Name.clear();
		First_Name.sendKeys(fname);
	}
	
	public void lastname(String lname)
	{
		Last_Name.clear();
		Last_Name.sendKeys(lname);
	}
	
	public void username(String uname)
	{
		User_Name.clear();
		User_Name.sendKeys(uname);
	}
	
	public void city(String city)
	{
		City.clear();
		City.sendKeys(city);
	}
	
	public void state(String state)
	{
		State.clear();
		State.sendKeys(state);
	}
	
	public void zip(String zip)
	{
		Zip.clear();
		Zip.sendKeys(zip);
	}
	
	public void agreeclick()
	{
		Agree.click();
	}
	
	public void submitclick()
	{
		Submit.sendKeys(Keys.ENTER);
	}
	
	public String displaySubmittedSuccessfullyMessage()
	{
		String successMessage=submittedSuccessfullyMessage.getText();
		return successMessage;
	}
	
	public String displaycheckboxValidationMessage()
	{
		String validationMessage=checkboxValidationMessage.getText();
		return validationMessage;
	}

}
