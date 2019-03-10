//launch chrome navigate to majento.com 
//and click on my account link and loign
//page load timeout

package com.abc.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo002
{

	public static void main(String[] args) throws InterruptedException 
	{
		try
		{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com"); 	//navigate to magento
		
		WebElement myacct = driver.findElement(By.linkText("My Account"));
		myacct.click();
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("nikhildandge.abc@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Welcome123");
		WebElement login = driver.findElement(By.id("send2"));
		login.click();
		Thread.sleep(5000);
		WebElement logout = 	driver.findElement(By.linkText("Log Out"));
		logout.click();
		driver.close();
		}
		catch(TimeoutException e)
		{
			e.printStackTrace();
			System.out.println("Unable to Load the Page WIth the Given time ");
		}
		
		}
		

}
