package com.techcrack.LearningSpring.module1.Tasks.BookApplication;

public record Customer(int id, String name, String email, int loyalityPoints) {
	public Customer{
		if (id < 0 || name == null || email == null || loyalityPoints < 0)
			throw new InvalidDataException("Invalid data for the Customer...");
	}
}
