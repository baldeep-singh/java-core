package com.learning.core.day10;
import java.io.*;
import java.util.Scanner;

public class D10P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        try (PrintWriter writer = new PrintWriter("io.txt")) {
            writer.println(inputString);
            System.out.println("String written to the file io.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        File file = new File("io.txt");
        long fileSize = file.length();
        System.out.println("Size of the file io.txt: " + fileSize + " bytes");

        try (BufferedReader reader = new BufferedReader(new FileReader("io.txt"))) {
            String line;
            System.out.println("Contents of the file io.txt:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }

        if (file.delete()) {
            System.out.println("File io.txt deleted successfully.");
        } else {
            System.out.println("Failed to delete the file io.txt.");
        }
    }
}
