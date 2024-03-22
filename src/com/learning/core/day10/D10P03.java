package com.learning.core.day10;
import java.io.*;
import java.util.Scanner;

class Student implements Serializable {
    private int rollNumber;
    private String name;
    private int age;
    private String address;

    public Student(int rollNumber, String name, int age, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}

public class D10P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter Roll Number:");
            int rollNumber = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter Name:");
            String name = scanner.nextLine();

            System.out.println("Enter Age:");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter Address:");
            String address = scanner.nextLine();

            try {
                if (rollNumber <= 0 || age <= 0 || name.isBlank() || address.isBlank()) {
                    throw new CustomException("Fields cannot be blank and Roll Number and Age must be numeric and positive.");
                }

                Student student = new Student(rollNumber, name, age, address);

                System.out.println("Do you want to save data in a file? (yes/no)");
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("yes")) {
                    FileOutputStream fileOut = new FileOutputStream("student.ser");
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(student);
                    out.close();
                    fileOut.close();
                    System.out.println("Data saved successfully.");
                } else {
                    System.out.println("Program terminated.");
                }

            } catch (CustomException | IOException ex) {
                System.out.println("Exception: " + ex.getMessage());
            }

        } catch (NumberFormatException ex) {
            System.out.println("Roll Number and Age must be numeric.");
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
