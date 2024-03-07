package com.learning.core.day5;
import java.util.HashSet;
import java.util.Scanner;
public class D05P04 {
	public static void main(String[] args) {
        
        Product p1 = new Product("p001", "Maruti 800");
        Product p2 = new Product("p002", "Maruti Zen");
        Product p3 = new Product("p003", "Maruti Dezire");
        Product p4 = new Product("p004", "Maruti Alto");

        
        HashSet<Product> products = new HashSet<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);

        Scanner scanner = new Scanner(System.in);

        

        System.out.print("Enter product ID and name (e.g., p001 Maruti 800): ");
        String inputId = scanner.next();
        String inputName = scanner.nextLine().trim();

        Product userInputProduct = new Product(inputId, inputName);
        if (products.contains(userInputProduct)) {
            System.out.println("Product is present.");
        } else {
            System.out.println("Product is not present.");
        }
    }
}
