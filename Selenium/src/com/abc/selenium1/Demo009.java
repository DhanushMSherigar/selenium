//framing X path using text method, 

package com.abc.selenium1;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo009
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\hp\\Desktop\\Selenium\\Selenium\\src\\com\\abc\\selenium1\\Demo009.html");    	//navigate to magento
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("123456");
		
		//td[text()='400']
		//input[@type='checkbox']
	}
		

}
