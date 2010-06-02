package com.rubicon.sample.services.impl;

import com.rubicon.sample.services.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public int add(int x, int y) {
		return x + y;
	}

}
