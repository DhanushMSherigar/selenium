//LAunch chrome, navigate to magento, click on my account, 
//click on back button, refresh the page, click on forward button

package com.abc.selenium1;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo005
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://F:///WebPages/Table.html");    	//navigate to magento
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("123456");
		
		driver.close();
	}
		

}
