package Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class program01 {
	@Test (dataProvider="dataname")
	public void callmethod(String name, int age) {
		System.out.println("name="+name +","+ "age="+age);
	}
	
	
	@DataProvider (name="dataname")
	public Object[][] testdata() {
		
		return new Object[][] {
			{"rohit", 20},
			{"daljeet", 33},
			{"rahul",44}
			
		};
		
	}

}
