package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups1 {
	
	@Test(groups="customer")
	public void test1()
	{
		Reporter.log("test1_C",true);
		
	}
	
	@Test(groups="customer")
	public void test2()
	{
		Reporter.log("test2_C",true);
	}

	@Test(groups="customer")
	public void test3()
	{
		Reporter.log("test3_C",true);
		
	}

}
