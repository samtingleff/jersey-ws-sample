package com.rubicon.sample.api.v1.ws;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.rubicon.sample.api.v1.form.ValidatingType;

@Component
@Scope("request")
@Path("/v1/validated")
public class ValidatingResource {

	private Validator validator;

	@Required
	@Autowired
	public void setValidator(Validator validator) {
		this.validator = validator;
	}

	@POST
	@Path("/postit")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String post(MultivaluedMap<String, String> params) {
		ValidatingType vt = new ValidatingType(params.getFirst("name"), params
				.getFirst("address"), params.getFirst("city"), params
				.getFirst("state"), params.getFirst("zip"), Integer
				.parseInt(params.getFirst("weight")));
		Set<ConstraintViolation<ValidatingType>> violations = validator
				.validate(vt);
		for (ConstraintViolation<ValidatingType> constraint : violations) {
			System.err.println(constraint);
			System.err.println(constraint.getMessage());
			System.err.println(constraint.getInvalidValue());
		}
		if (violations.size() > 0)
			throw new WebApplicationException(Response.Status.BAD_REQUEST);
		return "hello";
	}
}
