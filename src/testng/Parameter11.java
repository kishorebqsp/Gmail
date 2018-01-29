package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter11 
{
	@Parameters({"city","area"})
	@Test
	public void test1(String city,String area)
	{
		Reporter.log(city+" "+area,true);
		
	}

}
