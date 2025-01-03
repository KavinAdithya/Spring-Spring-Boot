package com.techcrack.LearningSpring.revise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverRevise {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(ConfigurationRevise.class)) {
//			String[] beansManaged = context.getBeanDefinitionNames();
//			
//			for (String bean : beansManaged) {
//				System.out.println(bean);
//			}
//			
//			System.out.println(context.getBeanDefinitionCount());
//			
//			var beanDefinition = context.getBeanDefinition("beanA");
//			
//			System.out.println(beanDefinition);
			
			
			var beanA = context.getBean("ram", BeanA.class);
			
			System.out.println(beanA.a);
		}
	}
}
