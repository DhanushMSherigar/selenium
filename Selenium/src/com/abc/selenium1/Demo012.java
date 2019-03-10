package com.abc.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo012 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\hp\\Desktop\\Selenium\\Selenium\\src\\com\\abc\\selenium1\\Demo012.html");   
		
	}
}
