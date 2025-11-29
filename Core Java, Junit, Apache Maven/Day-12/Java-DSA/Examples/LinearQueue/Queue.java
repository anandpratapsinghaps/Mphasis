package com.example.queue.arrays;

//Linear Queue
class Queue {
	private int[] arr;
	private int front;
	private int rear;
	private int capacity;

	public Queue(int size) {
		arr = new int[size];
		capacity = size;
		front = 0;  //The queue starts from index 0
		rear = -1;//Rear starts at -1 because queue is empty.
		//When first element arrives, rear becomes 0
	}

	// Add element to queue
	public void enqueue(int x) {
		if (isFull()) {
			System.out.println("Queue is full. Cannot enqueue " + x);
			return;
		}
		arr[++rear] = x;
		System.out.println("Enqueued: " + x);
	}

	// Remove element from queue
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty. Cannot dequeue.");
			return -1;
		}
		int value = arr[front];
		front++;
		return value;
	}

	/**
	 * Index: 0  1  2  3 
	 * Value: 10 20 30
	 * front = 0
	 * rear  = 2
	 * front > rear ?  No → queue NOT empty
	 */
	// Check if queue is empty
	public boolean isEmpty() {
		return front > rear;
	}

	// Check if queue is full
	public boolean isFull() {
		return rear == capacity - 1;//If rear reaches last index (capacity-1), queue is full.
	}

	/**
	 * size = rear - front + 1
	 * size = 2   -   0    + 1
	 * size = 3
	 */
	// Return current size
	public int size() {
		return (isEmpty()) ? 0 : (rear - front + 1);
	}
}
