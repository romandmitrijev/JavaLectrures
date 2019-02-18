package com.advancedFeatures.lambda.optional;

import java.util.Optional;

public class Exmple {
    public static void main(String[] args) {
        String valueNull = null;
        String valueNotNull = "Hello World";

        Optional<String> nullValue = Optional.ofNullable(valueNull);
        Optional<String> notNullValue = Optional.of(valueNotNull);

        System.out.println("Checking null: " + nullValue.isPresent());
        System.out.println("Checking not null: "+notNullValue.isPresent());
        System.out.println(notNullValue.get());
        //System.out.println(nullValue.get());

        notNullValue.ifPresent(System.out::println);

        System.out.println(notNullValue.orElse("Default message"));
        System.out.println(nullValue.orElse("Default message"));
    }
}
