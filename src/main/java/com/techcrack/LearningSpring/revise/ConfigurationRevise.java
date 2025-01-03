package com.techcrack.LearningSpring.revise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class ConfigurationRevise {
	@Bean 
	@Primary
	public BeanA beanA1() {
		var beanA = new BeanA();
		beanA.a = 100;
		return beanA;
	}
}
