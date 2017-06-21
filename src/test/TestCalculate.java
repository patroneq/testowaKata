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
	public void emptyStringReturnsZero() throws Exception {
		assertEquals(calculator.calculate(""),0);
	}
	
	@Test
	public void singleValueIsReplied() throws Exception {
		assertEquals(calculator.calculate("1"), 1);
	}
	
	@Test
	public void twoNumbersCommaDelimitedReturnsSum() throws Exception {
		assertEquals(calculator.calculate("1,2"), 3);
	}
	
	@Test
	public void twoNumbersNewLineDelimitedReturnsSum() throws Exception {
		assertEquals(calculator.calculate("1\n2"), 3);
	}

	@Test
	public void threeNumbersDelimitedBothWaysReturnSum() throws Exception {
		assertEquals(calculator.calculate("1,2,3"), 6);
	}
	
	@Test(expected = Exception.class)
	public void negativeInputReturnsException() throws Exception {
		calculator.calculate("-1");
	}
}
