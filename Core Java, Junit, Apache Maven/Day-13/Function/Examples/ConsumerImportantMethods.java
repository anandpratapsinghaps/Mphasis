package com.examples.functions;
import java.util.function.Consumer;

public class ConsumerImportantMethods {
    public static void main(String[] args) {

        // ----------------------------------
        // 1. accept(T t)
        // ----------------------------------
        Consumer<String> printer = s -> System.out.println("Printed: " + s);

        printer.accept("Hello");   // uses accept()


        // ----------------------------------
        // 2. andThen(Consumer after)
        // ----------------------------------
        Consumer<String> first = s -> System.out.println("First: " + s);
        Consumer<String> second = s -> System.out.println("Second: " + s);

        Consumer<String> combined = first.andThen(second);

        combined.accept("World");  // runs first then second
    }
}
