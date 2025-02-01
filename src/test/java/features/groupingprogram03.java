package features;

import org.testng.annotations.Test;

public class groupingprogram03 {
    @Test (groups = {"facebook" , "orange"})
	public void m1() {
		System.out.println("username");
	}
    @Test (groups = {"facebook", "instagram"})
    public void m2() {
    	System.out.println("password");
    }
    @Test (groups = {"orange", "instagram"})
    public void m3() {
    	System.out.println("login");
    }
    @Test (groups = {"facebook", "orange"})
    public void m4() {
    	System.out.println("create");
    }
    
    
    
    
    
    
}
