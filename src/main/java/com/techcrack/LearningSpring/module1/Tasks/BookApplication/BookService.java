package com.techcrack.LearningSpring.module1.Tasks.BookApplication;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {
	private List<Book> books;
	
	@Autowired
	public BookService(List<Book> books) {
		this.books = books;
	}
	
	public boolean addBook(Book book) {
		if (books == null) 
			throw new InvalidDataException("Books Object Missing...");
		
		return books.add(book);
	}
	
	public Book fetchBook(int id, String title) {
		
		if (books == null) 
			throw new InvalidDataException("Books Object Missing...");
		
		for (Book book : books) {
			if (id == book.id() && title.equals(book.title()))
				return book;
		}
		
		throw new InvalidDataException("Invalid Book Search...");
	}
	
	public void listingBook() {
		if (books == null) 
			throw new InvalidDataException("Books Object Missing...");
		
		if (books.isEmpty()) {
			System.out.println("No Books were founded...");
			return;
		}
		
		for (Book book : books)
			System.out.println(book);
	}
}
