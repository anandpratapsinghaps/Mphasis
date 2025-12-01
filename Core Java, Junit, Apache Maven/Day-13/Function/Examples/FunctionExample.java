package com.examples.functions;
import java.util.function.Function;

//A Function takes one argument and returns a result.
public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = str -> str.length();

        System.out.println(stringLength.apply("Java"));    // 4
        System.out.println(stringLength.apply("Function")); // 8
    }
}
