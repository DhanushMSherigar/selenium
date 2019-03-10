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
		
		FileInputStream fis= new FileInputStream("E:\\Selenium\\KeyWordDrivenFrameworks\\src\\com\\abc\\utilities\\KeyWord.Properties");
		
		Properties p = new Properties();
		p.load(fis);
		
		String myacct = p.getProperty("myacct");
		String email = p.getProperty("emailloc");
		String pass =p.getProperty("passloc");
		String login=p.getProperty("login");
		String logout=p.getProperty("logout");
		
		driver.get("https://www.magento.com");
		
		driver.findElement(By.xpath(myacct)).click();
		driver.findElement(By.xpath(email)).sendKeys("nikhildandge.abc@gmail.com");
		driver.findElement(By.xpath(pass)).sendKeys("Welcome123");
		driver.findElement(By.xpath(login)).click();
		driver.findElement(By.xpath(logout)).click();
		Thread.sleep(4000);
		driver.close();
	
	}
}
