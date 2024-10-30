package com.techcrack.LearningSpring.module1.Tasks.BookApplication;

public record Book(int id, String title, String author, double price) {
	public Book{
		if (id < 0 || title == null || author == null || price < 0.0)
			throw new InvalidDataException("Invalid Data For Book...");
	}
}
