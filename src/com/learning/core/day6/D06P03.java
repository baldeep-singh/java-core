import java.util.*;
import java.util.*;

class Book {
    private int bookId;
    private String title;
    private double price;
    private String dateOfPublication;
    private String author;

    public Book(int bookId, String title, double price, String dateOfPublication, String author) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.dateOfPublication = dateOfPublication;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String toString() {
        return bookId + " " + title + " " + price + " " + author + " " + dateOfPublication;
    }
}

public class D06P03 {
    public static void main(String[] args) {
        Set<Book> bookSet = new TreeSet<>(Comparator.comparingInt(Book::getBookId));

        Book book1 = new Book(1001, "Python learning", 750.0, "2/2/2020", "Martic C. Brown");
        Book book2 = new Book(1002, "Modern Mainframe", 295, "19/5/1997", "Sharad");
        Book book3 = new Book(1003, "Java", 523, "23/11/1987", "Gilad");
        Book book4 = new Book(1004, "Read C++", 295, "19/11/1984", "Henry");
        Book book5 = new Book(1005, ".NET Platform", 3497, "6/3/1984", "Mark");

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}
