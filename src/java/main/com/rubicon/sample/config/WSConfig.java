package com.rubicon.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rubicon.sample.api.v1.ws.AddResource;
import com.rubicon.sample.api.v1.ws.ComplexResource;
import com.rubicon.sample.api.v1.ws.EchoResource;
import com.rubicon.sample.api.v1.ws.FormResource;
import com.rubicon.sample.api.v1.ws.ValidatingResource;

@Configuration
public class WSConfig {

	@Bean
	public ValidatingResource validatingResource() {
		return new ValidatingResource();
	}

	@Bean
	public FormResource formResource() {
		return new FormResource();
	}

	@Bean
	public ComplexResource complexResource() {
		return new ComplexResource();
	}

	@Bean
	public AddResource addResource() {
		return new AddResource();
	}

	@Bean
	public EchoResource echoResource() {
		return new EchoResource();
	}
}
