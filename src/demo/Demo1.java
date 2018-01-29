package demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Parameters({"city","area"})
	@Test
	public void A(String city,String area)
	{
		Reporter.log(city,true);
		
	}

//	@Test(dependsOnMethods="A")
//	public void B()
//	{
//		Reporter.log("B",true);
//		Assert.fail();
//
//	}
//	
//	@Test
//	public void C()
//	{
//		Reporter.log("C",true);
//	}
}
