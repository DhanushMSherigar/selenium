//launch chrome navigate to majento.com 
//and click on my account link and loign

//CSS SElECTRORS
// 5.3. Sub String Contains with 
package com.abc.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo001
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
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

}
