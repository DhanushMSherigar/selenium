package com.abc.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium 
{

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "F:\\Selenium components\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.close();
	}

}
