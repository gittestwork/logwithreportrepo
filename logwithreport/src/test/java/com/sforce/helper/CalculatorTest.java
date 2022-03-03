package com.sforce.helper;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	int a, b, na, nb, i, j, ni, nj, expectedPositveSum, expectedNegitiveSum, expectedPositiveMul, expectedNegitiveMul;
	Calculator calculator;

	@Before
	public void setup() {
		a = 10;
		b = 30;
		na = -30;
		nb = -10;
		i = 5;
		j = 8;
		ni = -2;
		nj = -6;
		expectedPositveSum = 40;
		expectedNegitiveSum = -40;
		expectedPositiveMul = 40;
		expectedNegitiveMul = 12;
		calculator = new Calculator();
	}

	@Test
	public void testAddPositive() {
		int actualPositiveSum;
		actualPositiveSum = calculator.add(a, b);
		assertEquals(expectedPositveSum, actualPositiveSum);
	}

	@Test
	public void tesetAddNegitive() {
		int actualNegitigveSum;
		actualNegitigveSum = calculator.add(na, nb);
		assertEquals(expectedNegitiveSum, actualNegitigveSum);
	}

	@Test
	public void testMulPositive() {
		int actualPositiveMul;
		actualPositiveMul = calculator.mul(i, j);
		assertEquals(expectedPositiveMul, actualPositiveMul);
	}

	@Test
	public void testMulNegitive() {
		int actualNegitiveMul;
		actualNegitiveMul = calculator.mul(ni, nj);
		assertEquals(expectedNegitiveMul, actualNegitiveMul);
	}
}
