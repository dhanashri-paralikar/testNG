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

public class parameterisation01 {

	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Parameters({"URL"})
	@BeforeMethod
	public void setup( String URL) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
	}
	@Parameters ({"username", "password"})
	@Test 
	public void login(String US , String Pass) {
		WebElement username =driver.findElement(By.name("username"));
		username.sendKeys(US);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(Pass);
		
	WebElement ele= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	ele.click();
	}
	
	@Parameters ("expectedresult")
	@Test
	public void verifytext( String expectedresult) {
	WebElement text =driver.findElement(By.xpath("//p[text()=\"Forgot your password? \"]"));
	boolean t1 =text.isDisplayed();
	System.out.println(t1);
	
	}
	
	@AfterMethod
	public void Teardown() {
	driver.quit();
	}
	
	
}
