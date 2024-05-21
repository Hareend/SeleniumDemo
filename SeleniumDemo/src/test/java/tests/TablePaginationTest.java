package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverIntializer;
import pages.HomePage;
import pages.PaginationTable;
import pages.TablePagination;
import utils.ExcelUtil;
import utils.ReportUtil;
import utils.ScreenshotUtil;

public class TablePaginationTest extends DriverIntializer{
	
	WebDriver driver;
	HomePage homePage;	
	TablePagination tablepagination;
	PaginationTable paginationtable;
	ExcelUtil excelUtil;
	String name, position, office, age, startDay, salary;
	String fileName="ExcelRead.xlsx";
	String sheetName="Sheet1";
	int rowNumber;
	
	ScreenshotUtil screenshot;
	//ReportUtil reportutil;	
	
	@Test(priority = 1)
	public void getValuesFromExcel() throws IOException
	{		
		excelUtil = new ExcelUtil(fileName, sheetName);
		name= excelUtil.getStringData(1, 0);	
		position= excelUtil.getStringData(1, 1);
		office= excelUtil.getStringData(1, 2);
		age=excelUtil.getIntegerData(1, 3);
		startDay= excelUtil.getStringData(1, 4);
		salary= excelUtil.getStringData(1, 5);
		
	}	
	
	@Test(priority = 2)
	public void toGetRowNumber() throws IOException
	{
		driver=getDriver();
		homePage=new HomePage(driver);
		homePage.TableLinkClick();
		tablepagination=new TablePagination(driver);
		tablepagination.clickTableWithPagination();
		paginationtable=new PaginationTable(driver);
		rowNumber=paginationtable.getRowNumber(name);	
		//System.out.println(rowNumber+ " :Row Number");
		
		String currentPosition=paginationtable.getCurrentPosition(position, rowNumber);
		String currentOffice=paginationtable.getCurrentOffice(office, rowNumber);
		String currentAge=paginationtable.getCurrentAge(age, rowNumber);
		String currentStartDay=paginationtable.getCurrentStartDay(startDay, rowNumber);
		String currentSalary=paginationtable.getCurrentSalary(salary, rowNumber);
		Assert.assertEquals(currentPosition, position);
		Assert.assertEquals(currentOffice, office);
		Assert.assertEquals(currentAge, age);
		Assert.assertEquals(currentStartDay, startDay);
		Assert.assertEquals(currentSalary, salary);
		
		screenshot= new ScreenshotUtil();
		screenshot.TakeScreenshot(driver,"Table Pagination");
		
	/*	reportutil= new ReportUtil();
		reportutil.generateReports();
		reportutil.verifygenerateReports();
		reportutil.createTest("Testing: Table Pagination");
		reportutil.extenTestLogINFO();
		reportutil.extenTestLogPASS();
		reportutil.extenTestLogFAIL();
		reportutil.extenReportFLUSH();*/
	}	
	
	
	
}
