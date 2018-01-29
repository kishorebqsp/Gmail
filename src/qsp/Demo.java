package qsp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.gmail.com");
        
        driver.findElement(By.id("identifierId")).sendKeys("kishoreb017");
        
        driver.findElement(By.xpath("//span[.='Next']")).click();
        Thread.sleep(3000);
  driver.findElement(By.name("password")).sendKeys("********");
        
        driver.findElement(By.xpath("//span[.='Next']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[.='COMPOSE'])[3]")).click();
        
        driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("kishoreb017@gmail.com");
        
        driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Selenium");
        
        driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Documents");
         
        driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
        Thread.sleep(4000);
        Runtime.getRuntime().exec("C:\\Users\\nischay_gowda\\Desktop\\Up.exe");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[.='Send'])[2]")).click();
       
        driver.findElement(By.xpath("//div[@class='asf T-I-J3 J-J5-Ji']")).click();
	}

}
