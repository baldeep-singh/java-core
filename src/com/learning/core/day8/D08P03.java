package com.learning.core.day8;
class CircularQueue {
    private int[] array;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removedItem = array[front];
        front = (front + 1) % capacity;
        size--;
        return removedItem;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return array[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void printQueue() {
        int current = front;
        for (int i = 0; i < size; i++) {
            System.out.print(array[current] + " ");
            current = (current + 1) % capacity;
        }
        System.out.println();
    }
}

public class D08P03 {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(12);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(-8);

        System.out.print("Elements in queue: ");
        queue.printQueue();

        queue.dequeue();

        System.out.print("After removing first element: ");
        queue.printQueue();
    }
}
