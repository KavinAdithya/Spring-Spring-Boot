package com.techcrack.LearningSpring.xmlTask;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlTaskConfiguration {
	public static void main(String[] args) {
		try (var context =
				new ClassPathXmlApplicationContext("XmlTaskCongiration.xml")) {
			Category category = context.getBean(Category.class);
			
			System.out.println(category);
		
		}	
		
			
	}
}
