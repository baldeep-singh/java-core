package com.learning.core.day8;
import java.util.Scanner;
import java.util.LinkedList;

public class D08P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for the queue separated by spaces:");
        String input = scanner.nextLine();

        LinkedList<String> queue = buildQueue(input);

        if (isEmpty(queue)) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
    }

    public static LinkedList<String> buildQueue(String input) {
        LinkedList<String> queue = new LinkedList<>();
        String[] elements = input.trim().split("\\s+");
        for (String element : elements) {
            queue.add(element);
        }
        return queue;
    }

    public static boolean isEmpty(LinkedList<String> queue) {
        return queue.isEmpty();
    }
}
