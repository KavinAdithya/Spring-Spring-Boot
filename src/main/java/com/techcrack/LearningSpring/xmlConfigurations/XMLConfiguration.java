package com.techcrack.LearningSpring.xmlConfigurations;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techcrack.LearningSpring.module2.game.MarioGame;

public class XMLConfiguration {
	public static void main(String[] args) {
		try (var context =
				new ClassPathXmlApplicationContext("studentXML.xml")) {
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.println(context.getBean(Student.class));
//			System.out.println(context.getBean(Course.class));
			System.out.println(context.getBean("student1"));
			System.out.print(context.getBean("student1"));
			context.close();
		}
	}
}
