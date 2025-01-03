package com.techcrack.LearningSpring.module1.Tasks.businessTask;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MongoDBDataService implements DataService{
	@Override
	public int[] dataService() {
		return new int[] {1, 44, -11, 8, 23};
	}
}