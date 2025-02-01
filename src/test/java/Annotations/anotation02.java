package Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class anotation02 {
     WebDriver driver;
     
     @SuppressWarnings("deprecation")
     @BeforeMethod
	public void method1() {
    	 WebDriverManager.chromedriver().setup();
    	 driver = new ChromeDriver();
    	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	 driver.manage().window().maximize();
    	 driver.get("https://www.facebook.com/"); 
     }
     @Test
     public void testcase1() {
    	String title = driver.getTitle();
    	System.out.println("fb title="+ title);
     }
     @Test
     public void testcase2() {
    	boolean logo =  driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]")).isDisplayed();
    	System.out.println("fb logo="+logo);
     }
     @AfterMethod
     public void teardown() {
    	 driver.quit();
     }
}
