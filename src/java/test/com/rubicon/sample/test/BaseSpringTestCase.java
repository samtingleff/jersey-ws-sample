package com.rubicon.sample.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rubicon.sample.config.BeanConfig;

import junit.framework.TestCase;

public class BaseSpringTestCase extends TestCase {

	protected ApplicationContext ctx;

	public void setUp() throws Exception {
		ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
	}

	protected <V> V getBean(Class<V> cls) {
		return ctx.getBean(cls);
	}
}
