package com.techcrack.LearningSpring.Tasks.TOC;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	@Override
	public void move() {
		System.out.println("Car is Moving at 200 Km/per hour....");
	}
}
