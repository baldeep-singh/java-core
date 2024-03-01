package day_1;

public class Book {
    private String title;
    private double price;

    // Default constructor
    public Book() {
        this.title = "";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Getter and setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
