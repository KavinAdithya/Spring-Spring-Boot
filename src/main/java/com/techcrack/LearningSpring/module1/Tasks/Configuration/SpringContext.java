package com.techcrack.LearningSpring.module1.Tasks.Configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techcrack.LearningSpring.module1.Tasks.TOC.Travel;

public class SpringContext {
	public static void main(String[] args) {
		try (var context = 
				new AnnotationConfigApplicationContext(
						ConfigurationVehicle.class)) {

			//System.out.println(context.getBean(Bike.class).price);
			
//			var travelCar = new Travel(context.getBean(Car.class));
//			travelCar.startJourney();
			var travel = context.getBean(Travel.class);
			travel.startJourney();
			
//			var travelBike = new Travel(context.getBean(Bike.class));
//			travelBike.startJourney();
			
		//	System.out.println(context.getBean(Bike.class).price);
					
		}
		
	}	
}
