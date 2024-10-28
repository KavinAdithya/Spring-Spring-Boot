package com.techcrack.LearningSpring.module1.Tasks.TOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Travel {
	@Autowired(required = false)
	private Vehicle vehicle;
	
	@Autowired(required = false)
	private Car car;
	
	public Travel(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void startJourney() {
		vehicle.move();
		car.move();
	}
}
