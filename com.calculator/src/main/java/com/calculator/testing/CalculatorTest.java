package com.calculator.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.calculator.Calculator;

public class CalculatorTest {
	
	@Test
	public void testSum() {
		Calculator calc = new Calculator();
		int expected = 25;
		int result = calc.sum(5, 20);
		assertEquals(expected, result);
	}

	@Test
	public void testSub() {
		Calculator calc = new Calculator();
		int expected = 10;
		int result = calc.subtract(20, 10);
		assertEquals(expected, result);
	}

	@Test
	public void testMul() {
		Calculator calc = new Calculator();
		int expected = 78;
		int result = calc.mul(13, 6);
		assertEquals(expected, result);
	}

	@Test
	public void testDiv() {
		Calculator calc = new Calculator();
		int expected = 6;
		int result = calc.divide(78, 13);
		assertEquals(expected, result);
	}

}
