package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class calculatorTest {

	@Test
	public void addTwoNumbersTogether() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2,2);
		Assert.assertEquals(4, result);
	}
	@Test
	public void subtractTwoNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(6,2);
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void multipleTwoNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.multipley(6,2);
		Assert.assertEquals(12, result);
	}

}
