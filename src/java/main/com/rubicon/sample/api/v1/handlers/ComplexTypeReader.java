package com.rubicon.sample.api.v1.handlers;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import com.rubicon.sample.api.v1.form.ComplexType;

@Provider
@Consumes("application/x-complex")
public class ComplexTypeReader implements MessageBodyReader<ComplexType> {

	@Override
	public boolean isReadable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return ComplexType.class.isAssignableFrom(type);
	}

	@Override
	public ComplexType readFrom(Class<ComplexType> type, Type genericType,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
		return new ComplexType("some-term", 11);
	}

}
