package com.advancedFeatures.stream.one;

import java.util.Arrays;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {

        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(arr);
        stream1.forEach(System.out::println);

        Stream<String> stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::println);
    }

}
