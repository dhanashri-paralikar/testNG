package features;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class include_exclude01 {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void SetUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	}
	// Test case 1 - Verify that the email input filed is displayed

	@Test(enabled = true)
	public void Verifyemailiputfiled() {
	boolean emaildisplayed =driver.findElement(By.id("email")).isDisplayed();
	System.out.println(emaildisplayed);
	}
	@Test(enabled = true)
	public void Verifyepassinputfiled() {
	boolean passisplayed =

	driver.findElement(By.id("pass")).isDisplayed();
	System.out.println(passisplayed);
	}
	@Test(enabled = true)
	public void VerifyeLogin() {
	boolean login = driver.findElement(By.name("login")).isDisplayed();
	System.out.println(login);
	}
	@AfterMethod
	public void Teardown() {
	driver.quit();

}
}