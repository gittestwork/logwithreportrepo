package com.sforce.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
	private static Logger logger = LoggerFactory.getLogger(Calculator.class);

	public int add(int a, int b) {
		int sum = 0;
		logger.trace("entered into add() with a {}, b {}", a, b);
		sum = a + b;
		logger.info("returning sum value {}", sum);
		return sum;
	}

	public int mul(int i, int j) {
		int mul = 0;
		logger.trace("entered into mul() with i {},j {}", i, j);
		mul = i * j;
		logger.info("retuning mul value {}", mul);
		return mul;
	}
}
