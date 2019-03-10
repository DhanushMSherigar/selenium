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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo013
{

	public static void main(String[] args) throws InterruptedException 
	{
		try
		{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
												//                     ^
		// instead of thread.sleep(5000) using implicitlyWait method...
		
		driver.get("https://www.magento.com"); 	//navigate to magento
		
		WebElement myacct = driver.findElement(By.linkText("My Account"));
		myacct.click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("nikhildandge.abc@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Welcome123");
		
		WebElement login = driver.findElement(By.id("send2"));
		login.click();
		
		WebDriverWait wait = new  WebDriverWait(driver, 50);
		WebElement logout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Out")));
		
		logout.click();
		
		driver.close();
		System.out.println("Driver Loaded SuccessFully...!!!");
		System.out.println("Thank You For USing Magento.com ...!!!");
		
		
		}
		catch(TimeoutException e)
		{
			e.printStackTrace();
			System.out.println("Unable to Load the Page WIth the Given time ");
		}
		
		}
		
}
