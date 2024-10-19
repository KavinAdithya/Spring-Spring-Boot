package com.techcrack.LearningSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application02HelloWorld {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(context.getBean("name"));
	}
}
