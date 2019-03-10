package com.abc.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home
{
	
	WebDriver driver=null;
	@FindBy(linkText="My Account")
	
	WebElement myacct;
	
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void ClickOnMyacct()
	{
		myacct.click();
	}
}
