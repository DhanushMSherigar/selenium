// wa scrip to get the current url and title of the facebook application either by chrome or mozilla

package com.abc.selenium;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo05 
{
	public static void main(String[] args)
	{
		System.out.println("Enter The Browser Name");
		Scanner scan = new Scanner(System.in);
		String browser = scan.next();
		if(browser.equals("chrome"))
				{
					ChromeDriver c = new ChromeDriver();
					test(c);
				}
		else if (browser.equals("Firefox"))
		{
			FirefoxDriver f = new FirefoxDriver();
			test(f);
		}
		else
		{
			System.out.println("invalid input");
		}
		
		
	}
	public static void test(ChromeDriver driver)
	{
		driver.get("https://www.facebook.com");
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		String ctitle = driver.getTitle();
		System.out.println(ctitle);
	}
	public static void test(FirefoxDriver driver)
	{
		driver.get("https://www.facebook.com");
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		String ctitle = driver.getTitle();
		System.out.println(ctitle);
	}
}
