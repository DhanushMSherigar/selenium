package com.abc.selenium1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo021
{
	public static void main(String[] args) throws InterruptedException 
		{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\hp\\Desktop\\Selenium\\Selenium\\src\\com\\abc\\selenium1\\Demo020.html"); 
							//^Parent Class		Demo020.html
							//^Child Class Demo020.1.html
		
		Thread.sleep(4000);
	
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.linkText("parent")).click();
		
		Set<String>allIds = driver.getWindowHandles();
		
		ArrayList<String> list = new ArrayList<String>(allIds);
		driver.switchTo().window(list.get(1));
		
		driver.findElement(By.linkText("Child Tab")).click();
		
		Thread.sleep(4000);
		
		driver.quit();
	}
}