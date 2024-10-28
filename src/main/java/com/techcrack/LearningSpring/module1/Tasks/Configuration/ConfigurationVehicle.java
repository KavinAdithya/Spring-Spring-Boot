package com.techcrack.LearningSpring.module1.Tasks.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.techcrack.LearningSpring.module1.Tasks.TOC.Bike;
import com.techcrack.LearningSpring.module1.Tasks.TOC.Car;

@Configuration
@ComponentScan(basePackages = "com.techcrack.LearningSpring.Tasks.TOC")
public class ConfigurationVehicle {
	
//	@Bean
//	public Car car() {
//		return new Car();
//	}
//	
//	@Bean
//	public Bike bike() {
//		return new Bike();
//	}

}
