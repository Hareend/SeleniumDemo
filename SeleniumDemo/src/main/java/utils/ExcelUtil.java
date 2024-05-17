package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	static String excelLocation = System.getProperty("user.dir")+"/src/test/resources";
	String fileName, sheetName;
	
	public  String getStringData(int a, int b) throws IOException
	{
		//String ExcelLocation = System.getProperty("user.dir")+"\\source\\";
		f= new FileInputStream(excelLocation+"/"+fileName);
		w= new XSSFWorkbook(f);
		sh = w.getSheet(sheetName);
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
		
	}
	public  String getIntegerData(int a, int b) throws IOException
	{
		//String ExcelLocation = System.getProperty("user.dir")+"\\source\\";
		f= new FileInputStream(excelLocation+"/"+fileName);
		w= new XSSFWorkbook(f);
		sh = w.getSheet(sheetName);
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int z= (int) c.getNumericCellValue();
		return String.valueOf(z);
		
	}
	public ExcelUtil(String fileName, String sheetName) {
		
		this.fileName = fileName;
		this.sheetName = sheetName;
	}

}
