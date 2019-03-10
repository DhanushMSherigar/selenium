package com.abc.selenium2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo005 
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.get("C:\\Users\\hp\\Desktop\\Selenium\\Selenium\\src\\com\\popup\\selenium2\\Demo005.html");    	//navigate to magento
	
		List<WebElement> row = driver.findElements(By.xpath("//tbody/tr"));
		int rsize =row.size();
		System.out.println(rsize);
		
		List<WebElement> col = driver.findElements(By.xpath("//tbody/tr[1]/td"));
		int csize = col.size();
		System.out.println(csize);
	
			for (int i=1; i<=rsize; i++)
			{
				WebElement ele = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]"));
				System.out.println(ele.getText());
			}
	
	
	}

}
