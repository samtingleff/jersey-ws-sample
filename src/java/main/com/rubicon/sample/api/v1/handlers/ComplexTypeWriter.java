package com.rubicon.sample.api.v1.handlers;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.rubicon.sample.api.v1.form.ComplexType;

@Provider
@Produces("application/x-complex")
public class ComplexTypeWriter implements MessageBodyWriter<ComplexType> {

	@Override
	public boolean isWriteable(Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return ComplexType.class.isAssignableFrom(type);
	}

	@Override
	public long getSize(ComplexType ct, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType) {
		return String.format("%1$s:%2$d", ct.getTerm(), ct.getWeight())
				.length();
	}

	@Override
	public void writeTo(ComplexType ct, Class<?> type, Type genericType,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders,
			OutputStream entityStream) throws IOException,
			WebApplicationException {
		entityStream.write(String.format("%1$s:%2$d", ct.getTerm(),
				ct.getWeight()).getBytes());
	}

}
