package com.techcrack.LearningSpring.module1.Tasks.BookApplication;

import org.springframework.stereotype.Component;

@Component
public class PercentageDiscount implements DiscountService{
	private double percentage = 10;
	
	public PercentageDiscount() {
		super();
	}
	
	@Override
	public double discountAmount(double price) {
		return price - price / 100.0 * percentage;	
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
}
