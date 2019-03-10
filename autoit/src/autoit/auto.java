package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
	driver.get("file:///E:/auto1.html");
	driver.findElement(By.id("a")).click();
	Thread.sleep(4000);
	Runtime.getRuntime().exec("E:\\au.exe");
	
	}

}
