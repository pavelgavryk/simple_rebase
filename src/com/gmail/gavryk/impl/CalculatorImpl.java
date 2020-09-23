package com.gmail.gavryk.impl;

import com.gmail.gavryk.AddOperationHandler;
import com.gmail.gavryk.Calculator;
import com.gmail.gavryk.SubtractOperationHandler;

/**
 * Date: 23.09.2020
 *
 * @author Pavel Gavryk
 */
public class CalculatorImpl implements Calculator {

	private SubtractOperationHandler subtractHandler = new SubtractOperationHandlerImpl();
	private AddOperationHandler addHandler = new AddOperationHandlerImpl();

	@Override
	public int add(int a, int b) {
		return addHandler.add(a, b);
	}

	@Override
	public int subtract(int a, int b) {
		return subtractHandler.subtract(a, b);
	}
}
