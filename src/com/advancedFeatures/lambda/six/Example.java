package com.advancedFeatures.lambda.six;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Example {

    public static void main(String[] args) {

        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();
        int randomNumber = randomNumberSupplier.get();
        System.out.println(randomNumber);

        Consumer<Double> printWithPrefixConsumer = d -> System.out.println("Value: " + d);
        printWithPrefixConsumer.accept(10.5);

        UnaryOperator<Integer> toSquareUnaryOperator = i -> i * i;
        System.out.println(toSquareUnaryOperator.apply(5));


    }
}
