package day_1;

import java.util.ArrayList;

public class D01P01 {

	public static void createBook(ArrayList<Book> books, String title, double price) {
		Book newBook = new Book();
		newBook.setTitle(title);
		newBook.setPrice(price);
		books.add(newBook);
	}

	public static void showBooks(ArrayList<Book> books) {
		for (Book book : books) {
			System.out.println("Title: " + book.getTitle());
			System.out.println("Price: " + book.getPrice());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Creating an ArrayList to store books
		ArrayList<Book> books = new ArrayList<>();

		// Adding books
		createBook(books, "Java Programming", 350.00);
		createBook(books, "Data Structures", 500.00);

		// Showing books
		showBooks(books);
	}
}
