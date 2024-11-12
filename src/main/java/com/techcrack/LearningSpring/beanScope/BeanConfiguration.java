package com.techcrack.LearningSpring.beanScope;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)

class A{
	public A() {
		System.out.println("Class A Object Created...");
	}
}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
class B{
	public B() {
		System.out.println("Class B Object Created...");
	}
}

@ComponentScan
@Lazy
@Configuration
public class BeanConfiguration {
	public static void main(String[] args) throws BeansException, Exception {
		try (var context =
				new AnnotationConfigApplicationContext(BeanConfiguration.class)) {
			
			System.out.println("Application Initial SetUp Completed...");
			
//			context.getBean(BeanInspector.class).run(args);
//			System.out.println(context.getBean(A.class));
//			System.out.println(context.getBean(A.class));
//			System.out.println(context.getBean(A.class));
//			System.out.println(context.getBean(A.class));
//			
//			System.out.println(context.getBean(B.class));
//			System.out.println(context.getBean(B.class));
//			System.out.println(context.getBean(B.class));
//			System.out.println(context.getBean(B.class));
			
			
		}
	}
}
