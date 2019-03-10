//LAunch chrome, navigate to magento, click on my account, 
//click on back button, refresh the page, click on forward button

package com.abc.selenium1;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo004
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://account.magento.com/customer/account/create/");    	//navigate to magento
	
		WebElement dropdown = driver.findElement(By.name("company_type"));
		Select s = new Select(dropdown);
		s.selectByIndex(4);
		Thread.sleep(5000);
		s.selectByValue("selling");
		Thread.sleep(4000);
		s.selectByVisibleText("Analyst/Media");
		Thread.sleep(4000);				
		
		driver.close();
	}
		

}
