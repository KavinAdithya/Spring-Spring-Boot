package com.techcrack.LearningSpring.module1.Tasks.businessTask;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessConfiguration {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(BusinessConfiguration.class)) {
			BusinessCalculation businessCalculation = context.getBean(BusinessCalculation.class);
			
			System.out.println("Maximum Number is : " + businessCalculation.findMax());
		}
	}
}
