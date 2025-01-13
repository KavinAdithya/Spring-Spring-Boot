package com.techcrack.LearningSpring.revise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class BeanB {
	
	@Autowired
	@Qualifier(value = "dummy")
	public BeanA beanA;
	
	public BeanB() {
		super();
		System.out.println("Bean B Instantiated...");
	}
	
	@PostConstruct
	public void postInitialization() {
		System.out.println("Bean B Has Been Set Uped !");
	}
}
