
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoGroup 
{
	
	
	@BeforeMethod
	public void before()
	{
		System.out.println("executing before method");
	}
	
	@AfterMethod
	public void after()
	{
		System.out.println("executing after method");
	}
	
	@Test(priority=21)
	public void b()
	{
		System.out.println("inside b()");
	}
	
	@Test(priority=19)
	public void a()
	{
		System.out.println("inside a()");
	}
	
	
}
