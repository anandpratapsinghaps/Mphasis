package com.example.gc;
public class G1GCExample {
    public static void main(String[] args) {
        for (int i = 0; i < 200000; i++) {
            new Object(); // G1 cleans region by region
        }
        System.out.println("G1 GC Example");
    }
}
