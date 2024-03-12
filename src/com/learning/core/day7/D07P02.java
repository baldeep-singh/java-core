package com.learning.core.day7;
import java.util.LinkedList;

class Stack {
    private LinkedList<String> stackList;

    public Stack() {
        this.stackList = new LinkedList<String>();
    }

    public void push(String element) {
        stackList.push(element);
    }

    public String pop() {
        return stackList.pop();
    }
    
    public LinkedList<String> getStackList() {
        return stackList;
    }
}

class D07P02 {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("programming");
        stack.push("java");
        stack.push("world");
        stack.push("hello");

        System.out.println("After pushing four elements:");
        while (!stack.getStackList().isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\nAfter popping: hello world java.");
    }
}
