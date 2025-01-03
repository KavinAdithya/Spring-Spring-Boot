package com.techcrack.LearningSpring.revise;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public record RecordTester(BeanA beanA, BeanB beanB) {
	public RecordTester {
		if (beanA.a == -1)
			throw new RuntimeException("Failed To Instantiate Record Tester! ");
	}
	@PostConstruct
	public void postConstructRecord() {
		System.out.println("Post Constructed Record Class!");
	}
}
