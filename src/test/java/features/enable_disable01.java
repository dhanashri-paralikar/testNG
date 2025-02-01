package features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
// enable=true hai vo test case execute hogi and jo enable = false means disable hai vo test case execute nhi hogi
public class enable_disable01 {
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	@Test (enabled = true)
	public void username() {
		driver.findElement(By.id("email")).sendKeys("ddddddddd");
	}
	@Test (enabled = false)
	public void pass() {
		driver.findElement(By.id("pass")).sendKeys("test123");
	}

	@Test (enabled = true)
	public void login() {
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
