package testng;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends {
	
	@Test
	public void test1()
	{
		Reporter.log("test1",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods="test1")
	public void test2()
	{
		Reporter.log("test2",true);
	}

	@Test
	public void test3()
	{
		Reporter.log("test3",true);
		
	}
}
