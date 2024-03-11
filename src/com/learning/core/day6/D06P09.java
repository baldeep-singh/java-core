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

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
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

public class D06P09 {
    public static void main(String[] args) {
        TreeMap<String, Car> carMap = new TreeMap<>();
        carMap.put("Toyota", new Car("Toyota", 25000.0));
        carMap.put("Honda", new Car("Honda", 30000.0));
        carMap.put("Ford", new Car("Ford", 27000.0));
        carMap.put("Chevrolet", new Car("Chevrolet", 28000.0));
        carMap.put("BMW", new Car("BMW", 50000.0));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the car name to update price: ");
        String carName = scanner.nextLine();
        Car carToUpdate = carMap.get(carName);
        if (carToUpdate != null) {
            System.out.print("Enter the new price: ");
            double newPrice = scanner.nextDouble();
            carToUpdate.setPrice(newPrice);
            System.out.println("Price updated successfully!");
        } else {
            System.out.println("Car not found!");
        }

        System.out.println("\nUpdated TreeMap:");
        for (Map.Entry<String, Car> entry : carMap.entrySet()) {
            System.out.println("Car: " + entry.getKey() + ", Details: " + entry.getValue());
        }
    }
}
