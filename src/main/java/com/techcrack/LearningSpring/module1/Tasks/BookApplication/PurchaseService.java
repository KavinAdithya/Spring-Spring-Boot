package com.techcrack.LearningSpring.module1.Tasks.BookApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PurchaseService {
	private BookService bookService;
	private CustomerService customerService;
	
	@Autowired
	@Qualifier("flat")
	private DiscountService discountService;
	
	@Autowired
	private NotificationService notification;
	
	@Autowired
	public PurchaseService(BookService bookService, CustomerService customerService) {
		this.bookService = bookService;
		this.customerService = customerService;
	}
	
	public void purchaseBook(int bookId, String title, int customerId, String name) {
		try {
			Book book = bookService.fetchBook(bookId, title);
			Customer customer = customerService.findCustomer(customerId, name);
			double discountPrice = discountService.discountAmount(book.price());
			
			System.out.println("You Got Discount of " + (book.price() - discountPrice) + "Rs from " + book.price() + "Rs");
			updateLoyalityPoints(customer, discountPrice);
			
			notification.service();
			System.out.println("Thank You...");
		}
		catch(InvalidDataException e) {
			throw new InvalidDataException("Failed to purchasee due to " + e.getMessage());
		}
	}
	
	
	private void updateLoyalityPoints(Customer customer, double price) {
		System.out.println("On this purchase you got a " + (price / 10) + " points...");
	}
}
