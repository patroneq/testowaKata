package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Calculator;

public class TestCalculate {
	
	private Calculator calculator;
	
	@Before
	public void init() {
		calculator = new Calculator();
	}

	@Test
	public void emptyStringReturnsZero() {
		assertEquals(calculator.calculate(""),0);
	}
	
	@Test
	public void singleValueIsReplied() {
		assertEquals(calculator.calculate("1"), 1);
	}
	
	@Test
	public void twoNumbersCommaDelimitedReturnsSum() {
		assertEquals(calculator.calculate("1,2"), 3);
	}

}
