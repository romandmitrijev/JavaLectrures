package com.lectureSecondPart.one.stream.one.eight;

import java.util.Arrays;
import java.util.List;

public class Example {
    // streams - reduce method
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");
        String namesConcatenation = names.stream().reduce("", (currValue, element) ->
                (currValue.equals("") ? "" : currValue + ", ") + element);
        System.out.println(namesConcatenation);
    }
}
