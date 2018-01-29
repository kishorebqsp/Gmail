package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups2 {
	
	@Test(groups="products")
	public void test1()
	{
		Reporter.log("test1_P",true);
		
	}
	
	@Test(groups="products")
	public void test2()
	{
		Reporter.log("test2_P",true);
	}

	@Test(groups="products")
	public void test3()
	{
		Reporter.log("test3_P",true);
		
	}

}
