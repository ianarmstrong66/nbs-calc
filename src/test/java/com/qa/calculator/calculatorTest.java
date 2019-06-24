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

}
