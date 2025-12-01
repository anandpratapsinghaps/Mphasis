package com.examples.functions;
import java.util.*;
import java.util.stream.*;

public class MapExample1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amogha", "Harsh", "Vamsi");

        List<Integer> lengths = names.stream()
                                     .map(name -> name.length())
                                     .toList();

        System.out.println(lengths);  // [6, 5, 5]
    }
}
