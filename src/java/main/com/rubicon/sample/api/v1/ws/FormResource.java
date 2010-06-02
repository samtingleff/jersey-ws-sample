package com.rubicon.sample.api.v1.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
@Path("/v1/form")
public class FormResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String get() {
		return "hello";
	}

	@POST
	@Path("/postit")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String stuff(MultivaluedMap<String, String> params) {
		return params.getFirst("first") + "," + params.get("second").size();
	}

}
