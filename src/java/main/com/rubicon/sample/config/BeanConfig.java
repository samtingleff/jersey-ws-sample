package com.rubicon.sample.config;

import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.rubicon.sample.services.CalculatorService;
import com.rubicon.sample.services.EchoService;
import com.rubicon.sample.services.impl.CalculatorServiceImpl;
import com.rubicon.sample.services.impl.EchoServiceImpl;

@Configuration
public class BeanConfig {

	@Bean
	public ValidatorFactory getValidatorFactory() {
		return new LocalValidatorFactoryBean();
	}

	@Bean
	public CalculatorService calcService() {
		return new CalculatorServiceImpl();
	}

	@Bean
	public EchoService echoService() {
		return new EchoServiceImpl();
	}

}
