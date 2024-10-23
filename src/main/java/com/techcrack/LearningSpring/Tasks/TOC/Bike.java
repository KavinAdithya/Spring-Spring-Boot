package com.techcrack.LearningSpring.Tasks.TOC;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public double price = 10000.0;
	@Override
	public void move() {
		System.out.println("Bike Is Moving At 120 km/ per hour...");
		price = 20000.00;
	}
}
