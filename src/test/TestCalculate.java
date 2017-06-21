package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Calculator;

public class TestCalculate {

	@Test
	public void emptyStringReturnsZero() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.calculate(""),0);
	}

}
