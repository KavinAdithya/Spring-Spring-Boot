package com.techcrack.LearningSpring.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
	public ClassA() {
		System.out.println("ClassA Object has been Initialized by Spring Framework...");
	}
	
	public void doSomething() {
		System.out.println("Working Alone For Future...");
	}
}

@Component
@Lazy
class ClassB{
	private ClassA classA;
	
	@Autowired
	public ClassB(ClassA classA) {
		System.out.println("ClassA Object Has been Initialized by Spring Framework...");
		this.classA = classA;
	}
	
	public void doSomething() {
		classA.doSomething();
		System.out.println("Working Hard...");
	}
}

@Configuration
@ComponentScan
public class LazyConfiguration {
	public static void main(String[] args) {
		try (var context = 
				new AnnotationConfigApplicationContext(LazyConfiguration.class)) {
			
				System.out.println("Application started and spring initialization process bean beanse are completed...");
			
			context.getBean(ClassB.class).doSomething();
		}
	}
}
