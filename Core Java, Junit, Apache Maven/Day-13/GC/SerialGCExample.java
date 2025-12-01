package com.example.gc;
//java -XX:+UseSerialGC 
//java -XX:+UseSerialGC SerialGCExample
public class SerialGCExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            new Object(); // Creates many objects → triggers GC
        }
        System.out.println("Serial GC Example");
    }
}
