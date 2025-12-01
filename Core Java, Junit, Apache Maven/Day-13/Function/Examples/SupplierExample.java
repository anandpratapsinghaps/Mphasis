package com.examples.functions;
import java.util.function.Supplier;
import java.util.Random;

//A Supplier takes no arguments and returns a value.
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);

        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());
    }
}
