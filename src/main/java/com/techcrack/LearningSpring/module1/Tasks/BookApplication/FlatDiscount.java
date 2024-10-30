package com.techcrack.LearningSpring.module1.Tasks.BookApplication;

import org.springframework.stereotype.Component;

@Component
public class FlatDiscount implements DiscountService {
	private double flatPrice = 100;
	
	public FlatDiscount() {
		super();
	}
	
	@Override
	public double discountAmount(double price) {
		if (flatPrice >= price)
			return 0.0;
		return price - flatPrice;
	}
	
	public void setPrice(double flatPrice) {
		this.flatPrice = flatPrice;
	}
}
