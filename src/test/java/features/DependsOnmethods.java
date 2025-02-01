package features;
  
import org.testng.annotations.Test;
public class DependsOnmethods {
@Test
public void LogInTest() {
System.out.println("Test test case start");
System.out.println(10 / 2);
}
@Test(dependsOnMethods = "LogInTest")
public void Homepage() {
System.out.println("Homepage test ");
}
@Test(dependsOnMethods = "LogInTest")
public void Createnewaccount() {
System.out.println("Createnewaccount test ");
}
@Test(dependsOnMethods = "LogInTest")
public void RefreshTesta() {
System.out.println("RefreshTesta test ");
}
}
