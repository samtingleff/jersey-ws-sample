package com.rubicon.sample.services.test;

import com.rubicon.sample.services.EchoService;
import com.rubicon.sample.test.BaseSpringTestCase;

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
