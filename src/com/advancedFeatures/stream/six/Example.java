package com.advancedFeatures.stream.six;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Example {
    //stream mapToInt method
    //stream mapDouble method
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");
        OptionalDouble averageNameLengthOptional = names.stream().mapToInt(String::length).average();

        averageNameLengthOptional.ifPresent(System.out::println);
    }
}
