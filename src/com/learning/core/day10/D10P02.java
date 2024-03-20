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

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

class BlankFieldException extends Exception {
    public BlankFieldException(String message) {
        super(message);
    }
}

public class D10P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter roll number: ");
            int rollNumber = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter name: ");
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                throw new BlankFieldException("Name cannot be blank.");
            }

            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter address: ");
            String address = scanner.nextLine().trim();
            if (address.isEmpty()) {
                throw new BlankFieldException("Address cannot be blank.");
            }

            System.out.print("Do you want to write data to a file? (yes/no): ");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("yes")) {
                try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("student.dat"))) {
                    Student student = new Student(rollNumber, name, age, address);
                    outputStream.writeObject(student);
                    System.out.println("Data written to file successfully.");
                } catch (IOException e) {
                    System.out.println("Error writing data to file: " + e.getMessage());
                }
            } else {
                System.out.println("Program terminated.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Roll number and age should be numeric.");
        } catch (BlankFieldException e) {
            System.out.println(e.getMessage());
        }
    }
}
