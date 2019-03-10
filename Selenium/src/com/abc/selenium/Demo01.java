//LAUNCHING THE CHROME AND NAVIGATING TO GMAIL

package com.abc.selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo01 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String URL = "https://www.gmail.com";
		WebDriver driver = new ChromeDriver();
										driver.get(URL);
			Thread.sleep(5000);
			driver.close();
		
	}

}
