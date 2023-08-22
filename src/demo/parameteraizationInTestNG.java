package demo;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameteraizationInTestNG {
	
	@Test
	@Parameters({"userName","password"})
	public void method1(String uName, String pwd) {
		System.out.println("UserName Is: "+uName);
		System.out.println("Password Is: "+pwd);
	}
	
	@Test
	public void method2() {
		//Assert.assertEquals("20", "21");
		System.out.println("prioritiesInTestNGmethod2");
	}
	
	@Test
	public void method3() {
		System.out.println("prioritiesInTestNGmethod3");
	}


}
