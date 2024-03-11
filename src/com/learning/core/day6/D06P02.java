package com.learning.core.day6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class PhoneBook {
    private String name;
    private String phoneNumber;

    public PhoneBook(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

public class D06P02
{
    public static void main(String[] args) {
        Map<String, PhoneBook> phoneBook = new HashMap<>();
        String[][] data = {
            {"Amal", "1234567890"},
            {"Vanitha", "9876543210"},
            {"Joseph", "1112223333"},
            {"Smith", "5556667777"},
            {"Kathe", "9998887777"}
        };

       
        for (String[] person : data) {
            String name = person[0];
            String phoneNumber = person[1];
            phoneBook.put(name, new PhoneBook(name, phoneNumber));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name to search: ");
        String searchName = scanner.nextLine();

        PhoneBook searchedPerson = phoneBook.get(searchName);

        if (searchedPerson != null) {
            System.out.println("Phone Number: " + searchedPerson.getPhoneNumber());
        } else {
            System.out.println("Person not found in the phone book.");
        }
    }
}
