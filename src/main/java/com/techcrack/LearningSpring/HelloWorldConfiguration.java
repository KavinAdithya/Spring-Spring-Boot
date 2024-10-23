package com.techcrack.LearningSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age , Address address) {
	public void displayData() {
		System.out.println("Company Name is " + name + "\nIt was Old for " + age + " Agoo.. \n" + address);	
	}
}

record Address(String district, String state, String country) {
	@Override
	public String toString() {
		return "District : " + district +
				"\nState : " + state +
				"\nCountry : " + country;
	}
}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Techcrack";
	}
	
	@Bean
	public int age() {
		return 43;
	}
	
	@Bean
	public Person person() {
		return new Person("Techiess", 19, null);
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("Dharmapuri", "TamilNadu", "India");
	}
	
	@Bean
	@Qualifier("Native")
	public Address address1() {
		return new Address("Coimbatore", "Tamil Nadu", "India");
	}
	// Bean Reusing Existing
	// Method - 1
	// By Invoking method
	@Bean
	public Person person1() {
		return new Person(name(), age(), address());
	}
	
	// Method - 2
	// By Passing parameter spring will automatically invoke the particular parameter matched method
	@Bean
	@Primary
	public Person person2(String name, int age, @Qualifier("Native")Address address2) {
		return new Person(name, age, address2);
	}
 }