package com.gmail.gavryk.impl;

import com.gmail.gavryk.Calculator;
import com.gmail.gavryk.SubtractOperationHandler;

/**
 * Date: 23.09.2020
 *
 * @author Pavel Gavryk
 */
public class CalculatorImpl implements Calculator {

	private SubtractOperationHandler subtractHandler = new SubtractOperationHandlerImpl();

	@Override
	public int add(int a, int b) {
		return 0;
	}

	@Override
	public int subtract(int a, int b) {
		return subtractHandler.subtract(a, b);
	}
}
