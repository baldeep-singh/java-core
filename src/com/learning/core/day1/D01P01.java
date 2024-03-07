package com.learning.core.day1;



public class D01P01 {

	public static void createBook( String title, double price) {
		Book newBook = new Book();
		newBook.setTitle(title);
		newBook.setPrice(price);

	}

	public static void showBooks() {
		
			System.out.println("Title: " + book.getTitle());
			System.out.println("Price: " + book.getPrice());
			
	}

	public static void main(String[] args) {
		
		createBook("Java Programming", 350.00);
		showBook();
	}
}
