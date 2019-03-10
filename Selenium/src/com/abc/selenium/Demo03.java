//to print the current url of the web page
package com.abc.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo03 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Gmail.com");
		String curl =	driver.getCurrentUrl();
		System.out.println(curl);
	}

}
