package features;
import org.testng.annotations.Test;
public class Priority2 {

@Test(priority = 1)
public void LoginTest() {
System.out.println("Execting login test");
}
@Test(priority = 1)
public void Dashboardtest() {
System.out.println("Execting Dashboardtest test");
}
@Test(priority = -1)
public void LogoutTest() {
System.out.println("Execting LogoutTest test");
}
@Test()
public void LogoutTest1() {
System.out.println("Execting Without priority test");
}
}