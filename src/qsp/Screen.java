package qsp;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screen {

	public static void main(String[] args) throws IOException {
		
		String shots="./shots/";
		
		Date d=new Date();
        String now=d.toString().replace(':','-');
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        driver.get("https://www.facebook.com");
        
        TakesScreenshot ts=(TakesScreenshot) driver;
        
        File src = ts.getScreenshotAs(OutputType.FILE);
        
        File dst=new File(shots+now+".png");
        
        FileUtils.copyFile(src,dst);
        
        
       
     }

}
