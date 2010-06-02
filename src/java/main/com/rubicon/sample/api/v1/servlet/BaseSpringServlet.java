package com.rubicon.sample.api.v1.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rubicon.sample.config.BeanConfig;

public abstract class BaseSpringServlet extends HttpServlet {
	private static final long serialVersionUID = 2160084095583386085L;

	protected ApplicationContext ctx;

	public void init() throws ServletException {
		ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
	}

	@SuppressWarnings("unchecked")
	protected <V> V getBean(Class cls) {
		return (V) ctx.getBean(cls);
	}
}
