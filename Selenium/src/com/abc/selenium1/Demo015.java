	//NAVIGATE TO MAGENTO.COM
package com.abc.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo015 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com"); 	//navigate to magento
		
		WebElement myacct = driver.findElement(By.linkText("My Account"));
	
		String attribute = myacct.getAttribute("href");
		System.out.println(attribute);

		String tagname = myacct.getTagName();
		System.out.println(tagname);
		
		String text = myacct.getText();
		System.out.println(text);
	
		// o/p
			//https://account.magento.com/
			//a
			//My Account
	}
}
