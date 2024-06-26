package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
	WebDriver driver;
	
	public void TakeScreenshot(WebDriver driver, String screenshotName) throws IOException
	{
		String fileLocation = System.getProperty("user.dir")+"\\Test_Output";
		this.driver=driver;
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver ;
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        Long time= System.currentTimeMillis();
        FileUtils.copyFile(file,new File(fileLocation+"\\"+screenshotName+time+".png"));
        System.out.println("Screenshot Successfully Captured");
	}

}

