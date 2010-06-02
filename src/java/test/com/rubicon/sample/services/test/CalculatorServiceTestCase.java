package com.rubicon.sample.services.test;

import com.rubicon.sample.services.CalculatorService;
import com.rubicon.sample.test.BaseSpringTestCase;

public class CalculatorServiceTestCase extends BaseSpringTestCase {

	public void testAdd() {
		CalculatorService cs = super.getBean(CalculatorService.class);
		assertEquals(22, cs.add(19, 3));
	}
}
