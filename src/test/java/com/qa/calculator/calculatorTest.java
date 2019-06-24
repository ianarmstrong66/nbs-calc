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
		int result = calculator.multiply(6,2);
		Assert.assertEquals(12, result);
	}
	
	@Test
	public void divideTwoNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.divide(6,2);
		Assert.assertEquals(3, result);
	}
	
	@Test
	public void modulateTwoNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.modulation(6,2);
		Assert.assertEquals(0, result);
	}
}
