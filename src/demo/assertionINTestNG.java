package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionINTestNG {

	@Test()
	public void method1() {
		
		//Hard Assert and Soft Assert
		
		Assert.assertEquals(true, true);
	}
}
