package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
	
	WebDriver driver;
	
	public WaitUtil(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void implicitWait(int second) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(second));
	}
	
	public void explicitWaitVisibilityOfPageElement(WebElement pageElement)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(pageElement));			
	 		
	}
	
	public void explicitWaitTextToBePresentInElementValue(WebElement element, String message)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementValue(element, message));
	}
	
	public void explicitvisibilityOfElementLocated(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void fluentWaitTextToBePresentInElement(WebElement element, String message)
	{
		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
		fluentWait.pollingEvery(Duration.ofSeconds(8));
		fluentWait.withTimeout(Duration.ofSeconds(8));
		fluentWait.until(ExpectedConditions.textToBePresentInElement(element, message));
	}
}
