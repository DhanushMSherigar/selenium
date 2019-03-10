	//Navigate to clearTrip.com
package com.abc.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo016
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com"); 	//navigate to cleartrip.com
		
		WebElement rtrip = driver.findElement(By.id("RoundTrip"));
			
		WebElement rdate = driver.findElement(By.id("ReturnDate"));
		
		if(rtrip.isSelected())
		{
			System.out.println("RoundTrip is Selected");
		}
	
		else 
		{
			rtrip.click();
		}
		if(rdate.isDisplayed())
		{
			rdate.sendKeys("Sat, 22 Dec, 2018");
		}
		else
		{
			System.out.println("Return On is not Displayed");
		}
	Thread.sleep(5000);
	}
}
