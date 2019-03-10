//reduce the window size to 50% of the browser

package com.abc.selenium1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo014
{

	public static void main(String[] args) throws InterruptedException 
	{
		//	WebDriver driver = new FirefoxDriver();
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		
		Dimension dim = driver.manage().window().getSize();
			
		System.out.println(dim);
		
		System.out.println(dim.width);
		System.out.println(dim.height);
	
		Dimension ndim = new Dimension((dim.width)/2,(dim.height)/2);
		
		System.out.println(ndim.width);
		System.out.println(ndim.height);
		
		driver.manage().window().setSize(ndim);
	}
		
}