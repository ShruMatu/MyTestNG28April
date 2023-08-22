package demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestngBasics.test1;

import org.testng.annotations.Test;

public class test2 {
	
	@Test(groups = "Smoke Testing")
	@Parameters({"userName","password"})
	public void method1(String uName, String pwd) {
		System.out.println("UserName Is: "+uName);
		System.out.println("Password Is: "+pwd);
	}
	
	@Test
	public void method2() {
		System.out.println("test2method2");
	}

}
