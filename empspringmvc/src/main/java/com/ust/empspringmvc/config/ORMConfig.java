package com.ust.empspringmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration // to make this configuration class
public class ORMConfig {

	@Bean //to make it bean
	public LocalEntityManagerFactoryBean getBean() {
		
		LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
		
		bean.setPersistenceUnitName("employee-unit");
		return bean;
	}
	
}
