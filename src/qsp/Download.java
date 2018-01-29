package qsp;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Download {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://www.seleniumhq.org/download/");
        
        WebElement ele = driver.findElement(By.xpath("//td[.='Java']/following-sibling::td[3]/a"));

        ele.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
//        Robot r=new Robot();
//        
//        r.keyPress(KeyEvent.VK_ALT);
//        r.keyPress(KeyEvent.VK_S);
//     
//        r.keyRelease(KeyEvent.VK_ALT);
//        r.keyRelease(KeyEvent.VK_S);
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\nischay_gowda\\Desktop\\down.exe");
        
        
        
        
        
        
        
	}

}
