//LAunch chrome, navigate to magento, click on my account, 
//click on back button, refresh the page, click on forward button

package com.abc.selenium1;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo003
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.magento.com"); 	//navigate to magento
		
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
				driver.close();
	}
		

}
