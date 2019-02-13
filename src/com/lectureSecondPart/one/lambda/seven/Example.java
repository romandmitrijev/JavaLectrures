package com.lectureSecondPart.one.lambda.seven;

import java.util.function.UnaryOperator;

public class Example {
    public static void main(String[] args) {

        UnaryOperator<Integer> toSquareUnaryOperator = integer -> {
            integer = integer * integer;
            System.out.println("Result: " + integer);
            return integer;
        };
        toSquareUnaryOperator.apply(4);
    }
}
