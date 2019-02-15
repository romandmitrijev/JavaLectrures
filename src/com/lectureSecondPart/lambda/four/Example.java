package com.lectureSecondPart.lambda.four;

import java.util.function.Function;

public class Example {
    public static void main(String[] args) {

        Function<String, Integer> calculateLength = s -> s.length();
        System.out.println(calculateLength.apply("Hello World"));

        Function<Integer, Integer> addMeThree = integer -> integer + 3;
        System.out.println(addMeThree.apply(5));

        Function<String, String> replaceCommasWithDotsFunction = s -> s.replace(',', '.');
        System.out.println(replaceCommasWithDotsFunction.apply("a,b,c"));

    }

}
