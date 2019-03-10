package com.abc.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo018
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\hp\\Desktop\\Selenium\\Selenium\\src\\com\\abc\\selenium1\\Demo018.html"); 
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		int size = link.size();
		
		System.out.println(size);
		
		/*for(int i=0; i<size; i++)
		{
			String text = link.get(i).getText();
			System.out.println(text);
		}*/

		for (WebElement e : link)
		{
			if(e.getText().contains("Link 1"));
			{
				e.click();
			}
		
	
			System.out.println(e.getText());
		}	
	}
}
