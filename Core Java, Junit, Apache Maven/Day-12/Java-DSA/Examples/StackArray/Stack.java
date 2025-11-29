package com.example.stacks.arrays;
class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1; //Set the stack to “empty
    }

    // Add element to stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + x);
            return;
        }
        arr[++top] = x;
        System.out.println("Pushed: " + x);
    }

    // Remove element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; //Return -1 because nothing can be popped.
        }
        return arr[top--];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1; //Nothing to return.
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        }
        return arr[top];
    }
    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1; //True when stack has no more space.
    }

    // Get current size of stack
    public int size() {
        return top + 1;
    }
}
