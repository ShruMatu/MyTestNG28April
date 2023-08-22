package demo;

import org.testng.annotations.Test;

public class prioritiesInTestNG {
	
	//Default priority will be 0 
	//Priority will be negative number
	
	@Test(priority = 1)
	public void method1() {
		System.out.println("prioritiesInTestNGmethod1");
	}
	
	@Test
	public void method2() {
		System.out.println("prioritiesInTestNGmethod2");
	}
	
	@Test(priority = 1)
	public void method3() {
		System.out.println("prioritiesInTestNGmethod3");
	}

}
