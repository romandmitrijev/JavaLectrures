package com.lectureSecondPart.one.stream.one.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

    //stream map method
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");
        System.out.println(names);

        List namesLenght = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println(namesLenght);
    }
}
