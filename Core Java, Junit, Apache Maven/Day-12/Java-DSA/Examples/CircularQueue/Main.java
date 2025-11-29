package com.example.circularqueue.arrays;
public class Main {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Is full? " + q.isFull());
        System.out.println("Peek: " + q.peek());

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Peek after dequeue: " + q.peek());

        q.enqueue(40);
        System.out.println("Peek now: " + q.peek());
    }
}
