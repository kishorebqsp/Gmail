package qsp;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_shots {
	
	public static void screen(WebDriver driver,String folder) throws IOException
	{
		    Date d=new Date();
		    String now=d.toString().replace(':','-');
		 
		    TakesScreenshot ts=(TakesScreenshot) driver;
	        
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        
	        File dst=new File(folder+now+".png");
	        
	        FileUtils.copyFile(src,dst);
	}

}
