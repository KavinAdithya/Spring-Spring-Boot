package com.techcrack.LearningSpring.module1.Tasks.BookApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PurchaseService {
	private BookService bookService;
	private CustomerService customerService;
	
	@Autowired
	public PurchaseService(BookService bookService, CustomerService customerService) {
		this.bookService = bookService;
		this.customerService = customerService;
	}
	
	
}
