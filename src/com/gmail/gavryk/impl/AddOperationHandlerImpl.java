package com.gmail.gavryk.impl;

import com.gmail.gavryk.AddOperationHandler;

/**
 * Date: 23.09.2020
 *
 * @author Pavel Gavryk
 */
public class AddOperationHandlerImpl implements AddOperationHandler {
	@Override
	public int add(int a, int b) {
		return a + b;
	}
}
