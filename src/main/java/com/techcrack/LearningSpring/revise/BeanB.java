package com.techcrack.LearningSpring.revise;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class BeanB {
	public BeanB() {
		super();
		System.out.println("Bean B Instantiated...");
	}
	
	@PostConstruct
	public void postInitialization() {
		System.out.println("Bean B Has Been Set Uped !");
	}
}
