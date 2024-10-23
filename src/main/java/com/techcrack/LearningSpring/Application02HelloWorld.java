package com.techcrack.LearningSpring;

import java.util.Arrays;

import org.springframework.beans.factory.config.BeanDefinition;
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
		
//		Person person = (Person) context.getBean("person2");
//		person.displayData();
		
//		String[] beansManagedSpring = context.getBeanDefinitionNames();
//		
//		Arrays.stream(beansManagedSpring)
//			  .forEach(System.out::println);
//		
//		int beanCount = context.getBeanDefinitionCount();
//		System.out.println(beanCount);
		
		Person person = context.getBean(Person.class);
		person.displayData();
		
		
//		BeanDefinition bean = context.getBeanDefinition("address1");
//		System.out.println(bean.getDescription());
//		System.out.println(bean);
//		
	}
}
