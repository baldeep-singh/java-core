package com.learning.core.day5;
import java.util.Scanner;
import java.util.HashSet;
public class D05P05 
{
	public static void main(String[] args) {
        
        HashSet<Product> productSet = new HashSet<>();

       
        productSet.add(new Product("p001", "Maruti 800"));
        productSet.add(new Product("p002", "Maruti Zen"));
        productSet.add(new Product("p003", "Maruti Dezire"));
        productSet.add(new Product("p004", "Maruti Alto"));

        
        System.out.println("Initial set of products:");
        for (Product product : productSet) {
            System.out.println(product);
        }

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter product ID to delete: ");
        String productIdToDelete = scanner.nextLine();

        
        Product productToDelete = new Product(productIdToDelete, "");
        if (productSet.contains(productToDelete)) {
            productSet.remove(productToDelete);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }

        
        System.out.println("\nUpdated set of products:");
        for (Product product : productSet) {
            System.out.println(product);
        }
	}
}
