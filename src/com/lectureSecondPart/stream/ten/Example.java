package com.lectureSecondPart.stream.ten;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    //print even number of a list from 1 to 10
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> numberStream = numbers.stream();
        List<Integer> evenNumbersList = numberStream.filter(integer -> integer%2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbersList);
    }
}
