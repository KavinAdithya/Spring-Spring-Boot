package com.techcrack.LearningSpring.module1.Tasks.BookApplication;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class BookApplicationDriver {
	@Autowired
	private BookService bookService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private PurchaseService purchaseService;
	
	private Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(BookConfiguration.class)) {
			var bookDriver = context.getBean(BookApplicationDriver.class);
			
			bookDriver.startApplication(context);
		}
		catch(Exception e) {
			System.out.println("Failed Try Again...");
			e.printStackTrace();
		}
	}
	
	private void startApplication(ApplicationContext context) throws Exception{
		String desicion = null;
		
		do {
			System.out.println("Select operation ~03");
			System.out.println("Add New Book - 1");
			System.out.println("Add New Customer - 2");
			System.out.println("Purchase a Book - 3");
			int n = scan.nextInt();
			
			switch (n) {
				case 1 -> addBook();
				case 2 -> addCustomer();
				case 3 -> purchase();
			}
			System.out.print("Do You want to continue : ");
			desicion = scan.next();
			
		}while(desicion.equalsIgnoreCase("yes"));
		
	}
	
	private void addBook() {
		System.out.print("Enter the Book id : ");
		int id = scan.nextInt();
		
		scan.nextLine();
		System.out.print("Enter the Book title : ");
		String title = scan.nextLine();
		
		System.out.print("Enter the Book Author : ");
		String author = scan.nextLine();
		
		System.out.print("Enter the Price : ");
		double price = scan.nextDouble();
		
		bookService.addBook(new Book(id, title, author, price));
		System.out.println("Book Added Successfully...");
		
	}
	
	private void addCustomer() {
		System.out.print("Enter the Customer id : ");
		int id = scan.nextInt();
		
		scan.nextLine();
		System.out.print("Enter the Customer name : ");
		String customer = scan.nextLine();
		
		System.out.print("Enter the Customer E-Mail : ");
		String mail = scan.nextLine();
		
		customerService.addCustomer(new Customer(id, customer, mail));
		
		System.out.println("Customer Added Successfully...");
	}
	
	private void purchase() {
		System.out.print("Enter the Book id : ");
		int bookId = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the Book title : ");
		String title = scan.nextLine();

		System.out.print("Enter the Customer id : ");
		int customerId = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the Customer name : ");
		String customer = scan.nextLine();
		
		purchaseService.purchaseBook(bookId, title, customerId, customer);
	}
}
