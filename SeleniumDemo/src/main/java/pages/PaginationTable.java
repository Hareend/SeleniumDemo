package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PaginationTable {
	
	WebDriver driver;
	public PaginationTable(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public int getRowNumber(String name)
	{		
		int size = driver.findElements(By.xpath("//*[@id='dtBasicExample']/tbody/tr")).size();
		String rowName;
		for(int i=1;i<size;i++)
		{
			rowName=driver.findElement(By.xpath("//*[@id='dtBasicExample']/tbody/tr["+i+"]/td[1]")).getText();
			if(rowName.equalsIgnoreCase(name))
			{							
				size= i;
			}
		}
		return size;		
	}
	
	public String getCurrentPosition(String position, int i)
	{
		String CurrentPosition=driver.findElement(By.xpath("//*[@id='dtBasicExample']/tbody/tr["+i+"]/td[2]")).getText();
		return CurrentPosition;
	}	

	public String getCurrentOffice(String office, int i)
	{
		String CurrentOffice=driver.findElement(By.xpath("//*[@id='dtBasicExample']/tbody/tr["+i+"]/td[3]")).getText();
		return CurrentOffice;
	}	
	
	public String getCurrentAge(String age, int i)
	{
		String CurrentAge = driver.findElement(By.xpath("//*[@id='dtBasicExample']/tbody/tr["+i+"]/td[4]")).getText();
		return CurrentAge;
	}	
	
	public String getCurrentStartDay(String startDate, int i)
	{
		String CurrentStartDay=driver.findElement(By.xpath("//*[@id='dtBasicExample']/tbody/tr["+i+"]/td[5]")).getText();
		return CurrentStartDay;
	}	
	
	public String getCurrentSalary(String salary, int i)
	{
		String CurrentSalary=driver.findElement(By.xpath("//*[@id='dtBasicExample']/tbody/tr["+i+"]/td[6]")).getText();
		return CurrentSalary;
	}

}
