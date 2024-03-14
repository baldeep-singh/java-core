package com.learning.core.day8;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class D08P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for the queue separated by spaces:");
        String input = scanner.nextLine();
        Queue<Integer> originalQueue = buildQueue(input);
        
        Queue<Integer>[] result = splitQueue(originalQueue);
        
        System.out.println("Odd queue: " + result[0]);
        System.out.println("Even queue: " + result[1]);
    }

    public static Queue<Integer>[] splitQueue(Queue<Integer> originalQueue) {
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> evenQueue = new LinkedList<>();
        
        while (!originalQueue.isEmpty()) {
            int num = originalQueue.poll();
            if (num % 2 == 0) {
                evenQueue.offer(num);
            } else {
                oddQueue.offer(num);
            }
        }
        
        @SuppressWarnings("unchecked")
        Queue<Integer>[] result = new Queue[]{oddQueue, evenQueue};
        return result;
    }

    public static Queue<Integer> buildQueue(String input) {
        Queue<Integer> queue = new LinkedList<>();
        String[] elements = input.trim().split("\\s+");
        for (String element : elements) {
            queue.offer(Integer.parseInt(element));
        }
        return queue;
    }
}
