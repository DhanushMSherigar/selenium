package com.abc.selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo004
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("C:\\Users\\hp\\Desktop\\Selenium\\Selenium\\src\\com\\abc\\selenium2\\Demo004Frame2.html");    	//navigate to magento
		
		driver.findElement(By.id("mname")).sendKeys("Ramesh");
		Thread.sleep(4000);
	//	driver.switchTo().frame(0);
		//or
		
		driver.switchTo().frame("newframe");
		
		//driver.findElement(By.id("fname")).sendKeys("Sachin");
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("sachin");
		
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("mname")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("mname")).sendKeys("Naveen");
		
		Thread.sleep(4000);
		
	driver.quit();
	}
}
