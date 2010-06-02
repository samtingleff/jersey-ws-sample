package com.rubicon.sample.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import com.rubicon.sample.services.CalculatorService;
import com.rubicon.sample.services.EchoService;

public class EchoServiceImpl implements EchoService {
	@Autowired
	private CalculatorService calc;

	@Autowired
	@Required
	public void setCalculatorService(CalculatorService calc) {
		this.calc = calc;
	}

	public String echo(String msg) {
		return msg;
	}

	public int add(int x, int y) {
		return calc.add(x, y);
	}
}
