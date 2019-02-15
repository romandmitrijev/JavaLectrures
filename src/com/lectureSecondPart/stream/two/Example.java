package com.lectureSecondPart.stream.two;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example {

    //convert stream to the other collections
    //list set map

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");
        System.out.println(names);

        Set<String> namesCopy = names.stream().collect(Collectors.toSet());
        namesCopy.forEach(System.out::println);


    }
}
