package features;

import org.testng.annotations.Test;

public class groupingprogram02 {
	@Test (groups = "smoke")
	public void test1() {
		System.out.println("program1");
	}

	@Test (groups = "smoke")
	public void test2() {
		System.out.println("program2");
	}

	@Test (groups = "regration")
	public void test3() {
		System.out.println("program3");
	}

	@Test (groups = "regration")
	public void test4() {
		System.out.println("program4");
	}

}
