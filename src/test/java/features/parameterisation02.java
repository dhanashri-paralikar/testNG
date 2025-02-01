package features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterisation02 {
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Parameters ({"URL"})
	@BeforeMethod
	public void setup(String URL) {
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(URL);
	}
	@Parameters({"US","pass"})
	@Test
	public void login(String US, String pass) {
	WebElement username=	driver.findElement(By.id("email"));
	username.sendKeys("US");
	
	WebElement password= driver.findElement(By.id("pass"));
	password.sendKeys("pass");
	
	}
	@Test
	public void loginclick() {
		driver.findElement(By.name("login")).click();
	}
	 
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}

}
