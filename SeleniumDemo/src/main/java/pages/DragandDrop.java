package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WaitUtil;

public class DragandDrop {
	
	WebDriver driver; 
    Actions actions; 
    WaitUtil waitutil;
    
    public DragandDrop(WebDriver driver)
    { 
        this.driver = driver ; 
        PageFactory.initElements(driver,this); 
        this.actions = new Actions(driver); 
    } 
    @FindBy(xpath = "//div[@id='todrag']/child::span[text()='Draggable n°2']") WebElement elementToDrag; 
    @FindBy(id="mydropzone") WebElement target; 
    @FindBy(xpath = "//div[@id='mylist']/child::span") List<WebElement> droppedElements; 
 
    public void dragNDropElement() 
    { 
    	waitutil= new WaitUtil(driver);
    	waitutil.explicitWaitVisibilityOfPageElement(elementToDrag);
    	waitutil.explicitWaitVisibilityOfPageElement(target);
       actions.dragAndDrop(elementToDrag,target).build().perform();
    	
    } 
 
    public boolean isDropComplete(String text)
    { 
        boolean found = false; 
        for (WebElement droppedItem:droppedElements) 
        { 
            if(droppedItem.getText().equals(text))
            { 
                found = true; 
                break; 
            } 
        } 
        return  found; 
    } 
 
}