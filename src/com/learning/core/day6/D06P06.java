package com.learning.core.day6;
import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name+" "+price;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P06 {
    public static void main(String[] args) {
        TreeMap<Car, String> carMap = new TreeMap<>();

        carMap.put(new Car("Toyota", 25000.0), "Toyota");
        carMap.put(new Car("Honda", 30000.0), "Honda");
        carMap.put(new Car("Ford", 27000.0), "Ford");
        carMap.put(new Car("Chevrolet", 28000.0), "Chevrolet");
        carMap.put(new Car("BMW", 50000.0), "BMW");

        NavigableMap<Car, String> reverseCarMap = carMap.descendingMap();
    
        for (Map.Entry<Car, String> entry : reverseCarMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
