package com.abc.magento;

import org.testng.annotations.Test;

public class MagentoDemo 
{
	@Test(priority=19)
public void a_method() 
{
	System.out.println("inside A method");
}
	
	@Test(priority=19)
public void b_method() 
{
	System.out.println("inside B method");
}
	
	@Test(priority=19)
public void c_method() 
{
	System.out.println("inside C method");
}
	
	
}
