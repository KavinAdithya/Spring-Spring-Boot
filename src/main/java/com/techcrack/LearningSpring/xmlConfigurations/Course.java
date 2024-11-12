package com.techcrack.LearningSpring.xmlConfigurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Course {
	@Autowired
	@Qualifier("courseName")
	private String name;
	
	@Autowired
	private int duration;
	
	private double fees;
	
	private String topic;
	
	public Course() {
		super();
	}
	@Autowired
	public Course(String topic) {
		this.topic = topic;
	}
	
	@PostConstruct
	public void warmup() {
		System.out.println("Fetching...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Clean up");
	}

	public double getFees() {
		return fees;
	}

	@Autowired
	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", duration=" + duration + ", fees=" + fees + ", topic=" + topic
				+ ", getFees()=" + getFees() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
