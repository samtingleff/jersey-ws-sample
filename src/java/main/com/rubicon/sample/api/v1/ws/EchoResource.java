package com.rubicon.sample.api.v1.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.rubicon.sample.services.EchoService;

@Component
@Scope("request")
@Path("/v1/echo")
public class EchoResource {

	private EchoService es;
	
	@Required
	@Autowired
	public void setEchoService(EchoService service) {
		this.es = service;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String echoMeDude(@QueryParam("name") String name) {
		return es.echo("hey dude: (" + name + ")");
	}
}
