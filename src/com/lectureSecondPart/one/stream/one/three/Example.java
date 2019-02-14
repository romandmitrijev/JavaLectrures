package com.lectureSecondPart.one.stream.one.three;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");
        Optional<String> firstNameFirst = names.stream().findFirst();
        firstNameFirst.ifPresent(System.out::println);

        Optional<String> firstNameAny = names.stream().findAny();
        firstNameAny.ifPresent(System.out::println);
    }
}
