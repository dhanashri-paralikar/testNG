package features;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Priority1 {
WebDriver driver;
// @BeforeClass
// public void SetUp() {
// WebDriverManager.chromedriver().setup();
// driver = new ChromeDriver();
// driver.manage().window().maximize();
// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
// }
@Test(priority = 1)
public void AC() {
System.out.println("JK");
}
@Test(priority = 1)
public void AA() {

System.out.println("AD");
}
@Test(priority = 1)
public void AB() {
System.out.println("SR");
}
//
// @AfterClass
// public void Teardown() {
//
// driver.quit();
// }
}
