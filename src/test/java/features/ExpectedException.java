package features;

import org.testng.annotations.Test;
public class ExpectedException {
	
      @Test(expectedExceptions = ArithmeticException.class)
   public void Test() {
System.out.println("Hello");
System.out.println(10/0);
}
}
