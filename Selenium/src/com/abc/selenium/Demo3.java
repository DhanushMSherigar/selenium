//CSS SELECTORS
// 1.tag and id
package com.abc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com"); 	//navigate to facebook
		WebElement email = driver.findElement(By.cssSelector("input#email")); 		// to identify the element
		email.sendKeys("nikhildandge@gmail.com");
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
