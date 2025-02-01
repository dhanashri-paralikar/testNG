package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class anotation01 {
	@BeforeSuite
	public void fblogin0() {
		System.out.println("fb login test case 0");
	}
	@BeforeTest
	public void fblogin1() {
		System.out.println("fb login test case 1");
	}
	@BeforeClass
	public void fblogin2() {
		System.out.println("fb login test case 2");
	}
	@BeforeMethod
	public void fblogin3() {
		System.out.println("before method");
	}
	@Test
	public void method1() {
		System.out.println("test case count method1");
	}
    @Test
	public void method2() {
		System.out.println("test case count method2");
	}
    
    @AfterMethod
	public void fb0() {
		System.out.println("After method");
	}
	@AfterClass
	public void fb1() {
		System.out.println("fb test case 1");
	}
	@AfterTest
	public void fb2() {
		System.out.println("fb test case 2");
	}
	@AfterSuite
	public void fb3() {
		System.out.println("fb  test case 3");
	} 
    
}
