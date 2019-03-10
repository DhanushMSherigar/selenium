package com.abc.magento;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magento
{
public static void main(String[] args) throws IOException, InterruptedException 
	{	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		FileInputStream fis= new FileInputStream("E:\\Selenium\\DataDrivenFrameworks\\src\\com\\abc\\utilitypackage\\data.properties");
		
		Properties p = new Properties();
		p.load(fis);
		
		String url = p.getProperty("url");
		String email = p.getProperty("email");
		String password = p.getProperty("pass");
		
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		Thread.sleep(4000);
		driver.close();
	
	}
}
