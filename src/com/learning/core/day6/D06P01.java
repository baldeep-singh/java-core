package com.learning.core.day6;
import java.util.HashMap;
import java.util.Map;

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

public class D06P01 {
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

        System.out.println("Phone Book Details:");
        System.out.println("-------------------");
        for (Map.Entry<String, PhoneBook> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            PhoneBook details = entry.getValue();
            System.out.println("Name: " + details.getName() + ", Phone Number: " + details.getPhoneNumber());
        }
    }
}
