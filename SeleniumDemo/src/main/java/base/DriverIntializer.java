package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverIntializer {
	public static final String PAGE_URL ="https://selenium.qabible.in/";
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeClass
	public void setup(@Optional("chrome")String browser)
	{
		
		driver = WebDriverSession(browser);
		driver.get(PAGE_URL);
				
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	@AfterClass
	public void browserclose()
	{
		driver.quit();
	}

	public WebDriver WebDriverSession(String browsername)
	{
		WebDriver driver;
		switch(browsername)
		{
			case "chrome":
			{
				//WebDriverManager.chromedriver().setup();
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");		
				driver=new ChromeDriver();
				driver.get(PAGE_URL);
				driver.manage().window().maximize();
				break;
			}
			case "firefox":
			{
				System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\geckodriver.exe");		
				driver=new FirefoxDriver();
				driver.get(PAGE_URL);
				driver.manage().window().maximize();
				break;
			}
			case "edge":
			{
				System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\msedgedriver.exe");		
				driver=new EdgeDriver();
				driver.get(PAGE_URL);
				driver.manage().window().maximize();
				break;
			}
			
			default:
			{
				System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\msedgedriver.exe");		
				driver=new EdgeDriver();
				driver.get(PAGE_URL);
				driver.manage().window().maximize();
			}
		}
		return driver;
		
	
		
	}

}
