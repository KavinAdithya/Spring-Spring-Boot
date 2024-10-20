package com.techcrack.LearningSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application02HelloWorld {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// System.out.println(context.getBean("name"));
		
		// Person person = (Person)context.getBean("person");
		// person.displayData();
		// System.out.println(person.toString());
		
		// System.out.println(context.getBean("address2"));
		
		// System.out.println(context.getBean("person1"));
	}
}
