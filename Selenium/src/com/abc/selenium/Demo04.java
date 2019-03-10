//wa script to get the page source code of a web page
package com.abc.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo04 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Gmail.com");
		String curl =	driver.getPageSource();
		System.out.println(curl);
	}

}
