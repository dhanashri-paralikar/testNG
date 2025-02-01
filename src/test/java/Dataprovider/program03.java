package Dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class program03 {
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	@Test (dataProvider="originaldata")
	public  void logindata(String name, String pass , String expected) {
	WebElement username=	driver.findElement(By.xpath("//input[@class=\"email valid\"]"));
		username.clear();
		username.sendKeys(name);
		
		WebElement password =driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys(pass);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String Exp_Title = "Dashboard / nopCommerce administration";
		String actualtitle = driver.getTitle();
		
		if (expected.equals("valid")) {
			if (actualtitle.equals(Exp_Title)) {
				Assert.assertTrue(true);
			
			}
			else {
				Assert.assertTrue(false);
			}
		}
		
		if (expected.equals("invalid")) {
			if (actualtitle.equals(Exp_Title)) {
				Assert.assertTrue(true);
			
			}
			else {
				Assert.assertTrue(false);
		}
		}
		
	}
	@DataProvider (name = "originaldata")
	public Object[][] inputdata(){
		
		String object [][]= {{"admin@yourstore.com","admin","valid"},// originaldata
				{ "admin@yourstore.com", "admin123", "invalid" },
                 { "admin@yourstore12.com", "admin", "invalid" },
                 { "admin@yourstore12.com", "admin123", "invalid" } };
		
		return object;
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	

}
