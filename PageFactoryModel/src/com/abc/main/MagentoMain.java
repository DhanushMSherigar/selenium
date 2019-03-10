package com.abc.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.objects.Home;
import com.abc.objects.Login;
import com.abc.objects.Main;

public class MagentoMain 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		Home h = new Home(driver);
		h.ClickOnMyacct();
		
		Login l = new Login(driver);
		l.enterEmail("nikhildandge.abc@gmail.com");
		l.enterPass("Welcome123");
		l.clickOnLogin();
		
		Main m = new Main(driver);
		m.ClickOnLogout();
		
		Thread.sleep(4000);
		driver.quit();
		}
	
}