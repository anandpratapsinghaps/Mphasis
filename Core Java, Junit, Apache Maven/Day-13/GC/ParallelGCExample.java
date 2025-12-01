package com.example.gc;
//java -XX:+UseParallelGC ParallelGCExample
public class ParallelGCExample {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            new Object(); // Parallel GC cleans using multiple threads
        }
        System.out.println("Parallel GC Example");
    }
}
