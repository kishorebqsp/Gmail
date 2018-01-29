package screen;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import qsp.Generic_shots;

public class Test3 {
	
	@Test
	public void test1() throws IOException
	{
		String folder="./shots/";
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        driver.get("https://www.google.com");
		
		Reporter.log("test1",true);
	
		Generic_shots.screen(driver, folder);
		
	}

}
