package com.example.gc;
public class CMSGCExample {
    public static void main(String[] args) {
        for (int i = 0; i < 50000; i++) {
            new Object(); // CMS tries to minimize pause time
        }
        System.out.println("CMS GC Example");
    }
}
