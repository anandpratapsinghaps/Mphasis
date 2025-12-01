package com.examples.functions;
import java.util.function.Consumer;

/**
 * A Consumer takes one argument and returns nothing (void).
   Used for actions like printing, logging, storing, etc.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printMessage = msg -> System.out.println("Message: " + msg);

        printMessage.accept("Hello World!");
    }
}
