package com.rubicon.ifa.services.test;

import com.rubicon.ifa.test.BaseSpringTestCase;
import com.rubicon.sample.services.CalculatorService;

public class CalculatorServiceTestCase extends BaseSpringTestCase {

	public void testAdd() {
		CalculatorService cs = super.getBean(CalculatorService.class);
		assertEquals(22, cs.add(19, 3));
	}
}
