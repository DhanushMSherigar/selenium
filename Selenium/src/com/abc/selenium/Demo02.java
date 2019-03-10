//script title of the gmail application
package com.abc.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo02 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the Expected Title");
		Scanner scan = new Scanner(System.in);
		String etitle = scan.next();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Gmail.com");
		String atitle =	driver.getTitle();
		if(etitle.equalsIgnoreCase(atitle)) // o/p pass
			//if(etitle.equals(atitle)) o/p fail
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
scan.close();	}

}
