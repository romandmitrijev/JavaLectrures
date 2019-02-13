package com.lectureSecondPart.one.lambda.two;

import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        Person adultPerson = new Person(30, "Feride", "F");
        Predicate<Person> adultPersonTest = new AdultPersonTest();
        System.out.println(adultPersonTest.test(adultPerson));

        Predicate<Person> adultPersonTestWithLambda = person -> person.getAge() > 18;
        System.out.println(adultPersonTestWithLambda.test(adultPerson));

    }
}
