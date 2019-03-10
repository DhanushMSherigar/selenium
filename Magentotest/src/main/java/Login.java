

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	
	By email = By.id("email");
	By pass = By.id("pass");
	By login = By.id("send2");
	
	WebDriver driver=null;

	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterEmail(String em)
	{
		driver.findElement(email).sendKeys(em);		
	}
	
	public void enterPass(String pw)
	{
		driver.findElement(pass).sendKeys(pw);
	}
	
	public void clickOnLogin()
	{
		driver.findElement(login).click();
	}
}
