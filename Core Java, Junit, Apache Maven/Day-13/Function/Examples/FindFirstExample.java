package com.examples.functions;
import java.util.*;

public class FindFirstExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40);

        Optional<Integer> first = nums.stream().findFirst();

        System.out.println(first.get());  // 10
    }
}
