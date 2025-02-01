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

public class program02 {
	
  WebDriver	driver;
  
  @SuppressWarnings("deprecation")
  @BeforeMethod
public void setup() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  @Test (dataProvider = "inputdata")
  public void login(String name, String pass) {
	 WebElement username= driver.findElement(By.name("username"));
	 username.sendKeys(name);
	  
	 WebElement password= driver.findElement(By.name("password"));
	  password.sendKeys(pass);
	  
	  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	  
	 WebElement dashbord= driver.findElement(By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]"));
      boolean text = dashbord.isDisplayed();
      Assert.assertTrue(text);
      
  }
  @DataProvider (name= "inputdata")
  public Object[][] testdata(){
	  Object [][] data = new Object [3][2]; //3 rows , 2 column
	
	  
	data[0][0] = "Admin";
	data[0][1] = "admin123";
	
	data[1][0]= "Admin123";
	data[1][1]= "Admin";
	
	data[2][0]= "dhjjd";
	data[2][1]="jjla";
	return data;
  }
  @AfterMethod
  public void teardown() {
	  driver.quit();
  }

}
