	//Navigate to clearTrip.com
package com.abc.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo017
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com"); 	//navigate to cleartrip.com
		
		WebElement search = driver.findElement(By.id("SearchBtn"));
			
		if(search.isEnabled())
		{
			search.click();
			System.out.println(search.isEnabled());
			
		}
		else
		{
			System.out.println("Search Disabled");
		}
		
		
	}
	
}
