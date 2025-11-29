package com.example.circularqueue.arrays;
class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Add element to circular queue
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + x);
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
        System.out.println("Enqueued: " + x);
    }

    // Remove element from circular queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int value = arr[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return arr[front];
    }
}
