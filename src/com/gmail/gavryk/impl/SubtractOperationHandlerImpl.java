package com.gmail.gavryk.impl;

import com.gmail.gavryk.SubtractOperationHandler;

/**
 * Date: 23.09.2020
 *
 * @author Pavel Gavryk
 */
public class SubtractOperationHandlerImpl implements SubtractOperationHandler {

	@Override
	public int subtract(int a, int b) {
		System.out.println("subtract operation starts");
		System.out.println("subtract is in progress...");
		int result = a - b;
		System.out.println("subtract result =" + result);
		return multiplyResult(result, 2);
	}

	private int multiplyResult(int result, int i) {
		System.out.println("multiplication...");
		return result = 2* result;
	}
}
