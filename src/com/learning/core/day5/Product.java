package com.learning.core.day5;


public class Product {
    String productId;
    String productName;

    public Product(String id, String name) {
        this.productId = id;
        this.productName = name;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Product Name: " + productName;
    }
}

