//wap to click on forgotten account link into the fb page using PARTIAL LINK TEXT as a locator
package com.abc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com"); 	//navigate to facebook
		WebElement link = driver.findElement(By.partialLinkText("Forgotten")); 		// to identify the element
		link.click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
