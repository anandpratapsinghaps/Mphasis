package com.example.stacks.arrays;
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        System.out.println("Is empty? " + stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Is full? " + stack.isFull());
        System.out.println("Size: " + stack.size());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Size now: " + stack.size());
        System.out.println("Top after pop: " + stack.peek());
    }
}
