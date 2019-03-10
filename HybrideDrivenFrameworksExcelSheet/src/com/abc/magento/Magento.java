package com.abc.magento;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magento 
{
	public static XSSFSheet sheet=null;
	public static WebDriver driver=null;
	
	public static String getcellvalue(int row, int col)
	{
		XSSFRow r =sheet.getRow(row);
		XSSFCell c = r.getCell(col);
		
		String action =c.getStringCellValue();
		return action;
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{	
		
		FileInputStream fis= new FileInputStream("E:\\Selenium\\HybrideDrivenFrameworksExcelSheet\\src\\com\\abc\\utilities\\HybridDrivenFrameworksExcel.xlsx");
		//loads the content of property file to the FILE
		
		XSSFWorkbook book = new XSSFWorkbook(fis);
		sheet =book.getSheet("book");
		int row = sheet.getPhysicalNumberOfRows();
		System.out.println(row);
		
		for (int i=1; i<row; i++)
		{
			String actions = getcellvalue(i,2);
			System.out.println(actions);
			System.out.println();
			
			switch (actions)
			{
			case "open":
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
			break;
			
			case "navigate":
				driver.get(getcellvalue(i,4));
			
				break;
			
			case "click":
				driver.findElement(By.xpath(getcellvalue(i,3))).click();
				
				break;
				
			case "type":
				driver.findElement(By.xpath(getcellvalue(i,3))).sendKeys(getcellvalue(i,4));
				
				break;
				
			case "quit":
				driver.quit();
				break;
			
			}
			
			
		}
				
		
	}
}
