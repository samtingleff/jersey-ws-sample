package com.rubicon.ifa.services.test;

import com.rubicon.ifa.test.BaseSpringTestCase;
import com.rubicon.sample.services.EchoService;

public class EchoServiceTestCase extends BaseSpringTestCase {

	public void testEcho() {
		EchoService es = super.getBean(EchoService.class);
		assertEquals("hello world", es.echo("hello world"));
	}

	public void testAdd() {
		EchoService es = super.getBean(EchoService.class);
		assertEquals(22, es.add(10, 12));
	}
}
