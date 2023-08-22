package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvidersInTestNG {

	@DataProvider
	public Object[][] testData() {

		Object[][] myData = new Object[2][2];
		String str="Test1";
		// Enter data to row 0 column 0
		myData[0][0] = str;
		// Enter data to row 0 column 1
		myData[0][1] = "Test11";
		// Enter data to row 0column 2
		//myData[0][2] = "Test111";
		// Enter data to row 0 column 2
		myData[1][0] = "Test1111";
		// Enter data to row 0 column 2
		myData[1][1] = "Test11111";
		// Enter data to row 0 column 2
		//myData[1][2] = "Test111111";
		// return new Object[][] { { "data one" }, { "data two" }, { "data three" } };
		return myData;

	}
	
	@DataProvider
	public Object[][] testData1() {

		Object[][] myData = new Object[2][3];
		String str="ABC";
		// Enter data to row 0 column 0
		myData[0][0] = str;
		// Enter data to row 0 column 1
		myData[0][1] = "ABC";
		// Enter data to row 0column 2
		myData[0][2] = "ABC";
		// Enter data to row 0 column 2
		myData[1][0] = "ABC";
		// Enter data to row 0 column 2
		myData[1][1] = "ABC";
		// Enter data to row 0 column 2
		myData[1][2] = "ABC";
		// return new Object[][] { { "data one" }, { "data two" }, { "data three" } };
		return myData;

	}

	@Test(dataProvider = "testData1")
	public void method1(String UserName, String Password,String Password1) {
		System.out.println("UserName Is: " + UserName);
		System.out.println("Password Is: "+Password);
		System.out.println("Password1 Is: "+Password1);
	}
	
	@Test(dataProvider = "testData")
	public void method2(String UserName, String Password) {
		System.out.println("UserName Is: " + UserName);
		System.out.println("Password Is: "+Password);
		//System.out.println("Password1 Is: "+Password1);
	}



}
