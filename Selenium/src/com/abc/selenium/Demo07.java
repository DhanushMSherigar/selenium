//locator using the element by name email
package com.abc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo07 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("nikhildandge@gmail.com");
		
		Thread.sleep(3000);
		driver.close();
	}

}
