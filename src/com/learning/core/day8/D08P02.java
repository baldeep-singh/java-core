package com.learning.core.day8;
import java.util.LinkedList;

class MyQueue {
    private LinkedList<Integer> list;

    public MyQueue() {
        list = new LinkedList<>();
    }

    public void enqueue(int item) {
        list.addLast(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return list.removeFirst();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void printQueue() {
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

public class D08P02 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(119);
        queue.enqueue(129);

        System.out.print("Elements in queue: ");
        queue.printQueue();

        queue.dequeue();
        queue.dequeue();

        System.out.print("Elements after removing first two elements: ");
        queue.printQueue();
    }
}
