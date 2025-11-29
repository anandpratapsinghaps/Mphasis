package com.example.stack.linkedlist;
// Node for Linked List
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;  // top of the stack

    // Push element into stack
    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + x);
    }

    // Pop element from stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    // Peek top element
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        }
        return top.data;
    }
}
