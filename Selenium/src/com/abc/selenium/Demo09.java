//identify the password field of the facebook login page by using class as a locator
package com.abc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo09
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com"); 	//navigate to facebook
		WebElement classes = driver.findElement(By.id("pass")); 		// to identify the element
		classes.sendKeys("123456");
		
		Thread.sleep(3000);
		driver.close();
	}

}
