package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoClosable {
	
WebDriver driver;
	
	public AutoClosable(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "autoclosable-btn-success") WebElement autoclosableSuccessButton;
	@FindBy(xpath = "//div[@class='col-md-6']/child::div[2]") WebElement SuccessMessage;
	
	public void clickSuccessButton()
	{
		autoclosableSuccessButton.click();
	}
	
	public String SuccessMessage()
	{
		String SuccessMessageText=SuccessMessage.getText();
		return SuccessMessageText;
	}
	
	
}
