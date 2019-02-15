package com.lectureSecondPart.stream.ten;

import java.util.stream.Stream;

public class Example5 {

    public static void main(String[] args) {
        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);
    }
}
