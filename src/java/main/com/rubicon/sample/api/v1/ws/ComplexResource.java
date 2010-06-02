package com.rubicon.sample.api.v1.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.rubicon.sample.api.v1.form.ComplexType;

@Component
@Scope("request")
@Path("/v1/complex")
public class ComplexResource {

	@GET
	@Produces("application/x-complex")
	public ComplexType getStuff(@QueryParam("term") String term,
			@QueryParam("weight") int weight) {
		return new ComplexType(term, weight);
	}

	@POST
	@Consumes("application/x-complex")
	@Produces(MediaType.TEXT_PLAIN)
	public String stuff(ComplexType ct) {
		return ct.getTerm() + ":" + ct.getWeight();
	}

}
