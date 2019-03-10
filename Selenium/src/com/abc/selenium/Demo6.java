//CSS SElECTRORS
// 4.Tag, Class and Attribute for email for fb
package com.abc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com"); 	//navigate to facebook
		WebElement email = driver.findElement(By.cssSelector("input.inputtext[id='email']")); 		// to identify the element
		email.sendKeys("nikhildandge@gmail.com");
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
