package com.rubicon.sample.api.v1.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rubicon.sample.services.EchoService;

public class SampleServlet extends BaseSpringServlet {
	private static final long serialVersionUID = 1045801268888277539L;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		EchoService es = super.getBean(EchoService.class);
		response.setContentType("text/plain");
		response.getWriter().println(es.echo("hello world"));
	}
}
