	package com.techcrack.LearningSpring.PrePostConstruct;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class DataBaseAccessObject {
	
	public DataBaseAccessObject() {
		System.out.println("Data Base Access Object Created...");
	}
	
	@PostConstruct
	public void dataBaseConnection() {
		System.out.println("Data Base Connected....");
	}
	
	@PreDestroy
	public void cleanUpDataBase() {
		System.out.println("Leaving the Resource...");
	}
	
}

@Configuration
@ComponentScan
public class PostConstructConfiguration {
	public static void main(String[] args) {
		try (var context = 
				new AnnotationConfigApplicationContext(PostConstructConfiguration.class)) {
			
		}
	}
}
