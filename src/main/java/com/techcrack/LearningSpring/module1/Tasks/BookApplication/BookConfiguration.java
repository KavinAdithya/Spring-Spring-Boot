package com.techcrack.LearningSpring.module1.Tasks.BookApplication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class BookConfiguration {
	
	@Primary 
	@Bean
	public FlatDiscount flatDiscount() {
		return new FlatDiscount();
	}
	
	@Qualifier("flat")
	@Bean
	public DiscountService percentageDiscount() {
		return new PercentageDiscount();
	}
	
	@Bean
	public List<Book> books() {
		return new ArrayList<>();
	}
	
	@Bean
	public List<Customer> customers() {
		return new ArrayList<>();
	}
}
