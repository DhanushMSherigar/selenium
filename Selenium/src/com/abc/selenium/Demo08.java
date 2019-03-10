//locator using the element by name NAME
package com.abc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo08
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com"); 	//navigate to facebook
		WebElement name = driver.findElement(By.name("email")); 		// to identify the element
		name.sendKeys("nikhildandge@gmail.com");
		
		Thread.sleep(3000);
		driver.close();
	}

}
