package demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 extends Demo1{
	
	@Test
	public void B()
	{
		Reporter.log("B",true);
     }

}
