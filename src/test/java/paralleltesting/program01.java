package paralleltesting;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

public class program01 {
	WebDriver driver;
	@BeforeMethod
	public void SetUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	@Test
	public void testMethod1() {
	driver.get("https://www.facebook.com/");
	}

	@Test
	public void testmethod2() {
	driver.get("https://www.orangehrm.com/");
	}
	@Test
	public void testmethod3() {
	driver.get("https://demo.automationtesting.in/Register.html");
	}
	@Test
	public void testmethod4() {
	driver.get("https://demo.automationtesting.in/Register.html");
	}
	@AfterMethod
	public void Teardonw() {
	driver.quit();
	}
}
