package com.learning.core.day7;
class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new String[maxSize];
        this.top = -1;
    }

    public void push(String element) {
        if (top < maxSize - 1) {
            stackArray[++top] = element;
        } else {
            System.out.println("Stack is full. Cannot push element: " + element);
        }
    }

    public String pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }
    
    public int getTop() {
        return top;
    }
}

class D07P01{
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push("programming");
        stack.push("java");
        stack.push("world");
        stack.push("hello");

        System.out.println("After pushing four elements:");
        while (stack.getTop() >= 0) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\nAfter popping: hello world java.");
    }
}
