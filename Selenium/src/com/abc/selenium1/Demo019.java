package com.abc.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo019
{
	public static void main(String[] args) throws InterruptedException 
		{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\hp\\Desktop\\Selenium\\Selenium\\src\\com\\abc\\selenium1\\Demo019.html"); 
							//^Parent Class		Demo019.html
							//^Child Class Demo019.1.html
		
		Thread.sleep(4000);
	
		WebElement parent = driver.findElement(By.linkText("parent"));
		parent.click();
		
		Thread.sleep(4000);
		driver.quit();
	}
}