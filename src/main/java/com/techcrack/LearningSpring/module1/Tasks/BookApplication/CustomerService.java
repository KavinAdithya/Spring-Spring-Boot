package com.techcrack.LearningSpring.module1.Tasks.BookApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {
	List<Customer> customers;
	
	@Autowired
	public CustomerService(List<Customer> customers) {
		this.customers = customers;
	}
	
	public boolean addCustomer(Customer customer) {
		if (customers == null) 
			throw new InvalidDataException("Customers Object Missing...");
		
		return customers.add(customer);
	}
	
	public Customer findCustomer(int id, String name) {
		if (customers == null) 
			throw new InvalidDataException("Customers Object Missing...");
	
		for (Customer customer : customers) {
			if (customer.id() == id && name.equals(customer.name()))
				return customer;
		}
		
		throw new InvalidDataException("Invalid Customer data...");
	}
	
	public void listCustomers() {
		if (customers == null) 
			throw new InvalidDataException("Customers Object Missing...");
		
		if (customers.isEmpty()) {
			System.out.println("No Customers data were founded...");
			return;
		}
		for (Customer customer : customers)
			System.out.println(customer);
	}
}
