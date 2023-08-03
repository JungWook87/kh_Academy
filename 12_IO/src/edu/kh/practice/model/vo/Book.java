package edu.kh.practice.model.vo;

import edu.kh.practice.model.service.BookService;

public class Book {
	
	private String name;
	private String author;
	private int price;
	private String publisher;
	private int bookNumber;
	
	public Book() { 
		this.bookNumber = BookService.count;
		BookService.count++;
	}

	public Book(String name, String author, int price, String publisher) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.bookNumber = BookService.count;
		BookService.count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	@Override
	public String toString() {
		return name +"	"+ author + "	" + price + "원	" + publisher;
	}
	
	
	
}
