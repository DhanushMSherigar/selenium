//framing X path using text method using &nbsp, 

package com.abc.selenium1;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo011
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\hp\\Desktop\\Selenium\\Selenium\\src\\com\\abc\\selenium1\\Demo011.html");    	//navigate to magento
		
		
		//td[contains(text(),'ManualTesting')]
		//it wont work, it works only for first and last word contains with &nbsp
	
		}
		

}
