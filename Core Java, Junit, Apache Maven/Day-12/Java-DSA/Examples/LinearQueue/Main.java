package com.example.queue.arrays;
public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(3);

        System.out.println("Is empty? " + q.isEmpty());
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Is full? " + q.isFull());
        System.out.println("Size: " + q.size());

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Size now: " + q.size());
    }
}
