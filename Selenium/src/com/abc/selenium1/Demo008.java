//identify the radio buttons in the web page, 

package com.abc.selenium1;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo008
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\hp\\Desktop\\Selenium\\Selenium\\src\\com\\abc\\selenium1\\Demo008.html");    	//navigate to magento
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("123456");
		
		//input[@type='radio']
		//input[@type='checkbox']
	}
		

}
