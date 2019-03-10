package com.abc.selenium2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo002
{
	public static void main(String[] args) throws InterruptedException 
	{

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.echoecho.com/javascript4.htm");
	
	WebElement confirmbox = driver.findElement(By.name("B2"));
	confirmbox.click();
	
	Alert a = driver.switchTo().alert(); // make Driver switch to alert box
	System.out.println(a.getText());
	Thread.sleep(4000);
	a.dismiss(); //clicks on cancel button
	Thread.sleep(4000);
	driver.close();
		
	}
}
