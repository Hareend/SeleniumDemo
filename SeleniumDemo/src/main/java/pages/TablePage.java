package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TablePage {
	
	WebDriver driver;
	
	public TablePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="//*[@id='dtBasicExample']/tbody/tr") WebElement Name;
	
	
	
	public void pagination()
	{
		int size = driver.findElements((By) Name).size();
		
		String currentName, currentAge, Salary;
		for (int i = 1; i <= size; i++) 
		{

			currentName = driver.findElement(By.xpath("//*[@id='dtBasicExample']/tbody/tr[" + i + "]/td[1]")).getText();
			System.out.println(currentName);

		if (currentName.equalsIgnoreCase("Ashton Cox")) 
			{
				Salary = driver.findElement(By.xpath("//*[@id='dtBasicExample']/tbody/tr[" + i + "]/td[6]")).getText();
				System.out.print(Salary);
				SoftAssert softassert = new SoftAssert(); //Soft Assert
				softassert.assertEquals("$86,000", Salary);
				currentAge = driver.findElement(By.xpath("//*[@id='dtBasicExample']/tbody/tr[" + i + "]/td[4]")).getText();
				System.out.println(currentAge);
				Assert.assertEquals("66", currentAge); //hard Assert
				softassert.assertAll(); // to mark the soft assert as fail
				break;
			}
		}
	}

}
