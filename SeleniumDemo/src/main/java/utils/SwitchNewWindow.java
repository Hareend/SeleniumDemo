package utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchNewWindow {
	
	WebDriver driver;
	
	public SwitchNewWindow(WebDriver driver)
	{
		this.driver= driver;
		String parentWindow = driver.getWindowHandle();
		Set<String> WindowHandless = driver.getWindowHandles();
		for(String childWindow : WindowHandless)
		{
			if(!parentWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
			}
		}
		driver.manage().window().maximize();
	}

}
