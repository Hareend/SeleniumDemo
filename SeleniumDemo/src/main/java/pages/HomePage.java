package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(@href,'index.php')]")
	WebElement Homepage;
	
	@FindBy(xpath = "//a[contains(@href,'simple-form-demo.php')]")
	WebElement InputForm;
	
	@FindBy(xpath = "//a[contains(@href,'date-picker.php')]")
	WebElement DatePickers;
	
	@FindBy(xpath = "//a[contains(@href,'table-pagination.php')]")
	WebElement TableLink;
	
	@FindBy(xpath = "//a[contains(@href,'jquery-progress-bar.php')]")
	WebElement ProgressBars;
	
	@FindBy(xpath = "//a[contains(@href,'bootstrap-alert.php')]")
	WebElement AlertsAndModals;
	
	@FindBy(xpath = "//a[contains(@href,'bootstrap-dual-list.php')]")
	WebElement ListBox;
	
	@FindBy(xpath = "//a[contains(@href,'drag-drop.php')]")
	WebElement Others;

	public void HomePageClick()
	{
		Homepage.click();
	}
	
	public void InputFormClick()
	{
		InputForm.click();
	}
	
	public void DatePickersClick()
	{
		DatePickers.click();
	}
	
	public void TableLinkClick()
	{
		TableLink.click();
	}
	
	public void ProgressBarsClick()
	{
		ProgressBars.click();
	}
	
	public void AlertsAndModalsClick()
	{
		AlertsAndModals.click();
	}
	
	public void ListBoxClick()
	{
		ListBox.click();
	}
	
	public void OthersClick()
	{
		Others.click();
	}
}
