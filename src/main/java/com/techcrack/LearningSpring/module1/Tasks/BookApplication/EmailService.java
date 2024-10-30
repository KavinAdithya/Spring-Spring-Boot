package com.techcrack.LearningSpring.module1.Tasks.BookApplication;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements NotificationService{
	@Override
	public void service() {
		System.out.println("Email Has been succcessfully...");
	}
}
