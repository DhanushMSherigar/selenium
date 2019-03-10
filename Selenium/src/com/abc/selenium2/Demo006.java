package com.abc.selenium2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo006 
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("C:\\Users\\hp\\Desktop\\Selenium\\Selenium\\src\\com\\abc\\selenium2\\Demo006.html");    	//navigate to magento
	
		List<WebElement> row = driver.findElements(By.xpath("//tbody/tr"));
		int rsize =row.size();
		System.out.println(rsize);
		
		List<WebElement> col = driver.findElements(By.xpath("//tbody/tr[1]/td"));
		int csize = col.size();
		System.out.println(csize);
	
		int total=0;
		
		for (int i=2; i<=rsize; i++)
			{
				WebElement ele = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[3]"));
				String text = ele.getText();
				
				String text1 =	text.replace("$", "").replace(",", "");
		
				total+=Integer.parseInt(text1);
		
			}
			System.out.println(total);
	
	}

}
