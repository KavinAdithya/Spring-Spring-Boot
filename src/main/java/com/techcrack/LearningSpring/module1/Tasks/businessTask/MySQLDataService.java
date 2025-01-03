package com.techcrack.LearningSpring.module1.Tasks.businessTask;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Qualifier("MySQL")
@Repository
public class MySQLDataService implements DataService{
	
	@Override
	public int[] dataService() {
		return new int[] {76, 1, 6, 3, -1, 29, 98, 56};
	}
}
