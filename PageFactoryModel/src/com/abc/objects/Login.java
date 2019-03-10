package com.abc.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="pass")
	WebElement pass;
	@FindBy(id="send2")
	WebElement login;
	
	WebDriver driver=null;

	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String em)
	{
		email.sendKeys(em);		
	}
	
	public void enterPass(String pw)
	{
		pass.sendKeys(pw);
	}
	
	public void clickOnLogin()
	{
		login.click();
	}
}
