package com.techcrack.LearningSpring.revise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service("beanA")
@Qualifier("dummy")
public class BeanA {
	int a = 1;
	
	public BeanA() {
		super();
		System.out.println("Bean A Instantiated...");
	}
	
	@PostConstruct
	public void postInitialization() {
		System.out.println("Bean A Has Been Set Uped !");
	}
}
