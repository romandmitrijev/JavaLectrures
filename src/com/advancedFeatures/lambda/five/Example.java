package com.advancedFeatures.lambda.five;

import com.advancedFeatures.lambda.two.Person;

import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {

        Person adultPerson = new Person(30, "Feride", "F");
        Predicate<Person> adultPersonTest = Person::isAdult;
        System.out.println(adultPersonTest.test(adultPerson));

    }

}
