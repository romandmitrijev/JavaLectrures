package com.lectureSecondPart.stream.seven;

import java.util.Arrays;
import java.util.List;

public class Example {
    // allMatch anyMatch noneMatch
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");
        boolean allNamesLenghtIsGtHhan3 = names.stream().allMatch(n -> n.length() > 3);
        System.out.println("All names length greater than 3: " + allNamesLenghtIsGtHhan3);

        boolean thereIsANameWhichLenghtIsGtThan3 = names.stream().anyMatch(n -> n.length() > 3);
        System.out.println("At least one element' length " + "greater than 3: " +thereIsANameWhichLenghtIsGtThan3);
    }
}

