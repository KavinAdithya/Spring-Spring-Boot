package com.techcrack.LearningSpring.module1.Tasks.businessTask;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculation {
	private DataService dataService;
	
	@Autowired
	public BusinessCalculation( @Qualifier("MySQL") DataService dataService) {
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.dataService())
					 .max()
					 .orElse(0);
	}
}
