package com.learning.core.day5;
import java.util.HashSet;


public class D05P03 {

    public static void main(String[] args) {
        HashSet<Product> ds = new HashSet<>();
        ds.add(new Product("p001", "Maruti 800"));
        ds.add(new Product("p002", "Maruti Zen"));
        ds.add(new Product("p003", "Maruti Dezire"));
        ds.add(new Product("p004", "Maruti Alto"));
        for (Product prd : ds) {
            System.out.println(prd);
        }
    }
}