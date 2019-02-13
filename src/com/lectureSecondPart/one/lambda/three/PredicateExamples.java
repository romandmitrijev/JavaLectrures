package com.lectureSecondPart.one.lambda.three;


import com.lectureSecondPart.one.lambda.two.Person;

import java.util.function.Predicate;

public class PredicateExamples {
    public static void main(String[] args) {
        Person adultPerson = new Person(30, "Feride", "F");


        Predicate<Person> adultPersonTestWithLambda = person -> person.getAge() > 18;
        System.out.println(adultPersonTestWithLambda.test(adultPerson));

        System.out.println(isAdultMale().test(adultPerson));
        System.out.println(checkAge(70).test(adultPerson));
        System.out.println(isFemale().and(checkAge(60)).test(adultPerson));
        System.out.println(isAdultMale().or(checkAge(60)).test(adultPerson));

    }
    private static Predicate<Person> isFemale() {
        return person -> person.getGender().equalsIgnoreCase("F") ;
    }

    private static Predicate<Person> isAdultMale() {
        return person -> person.getGender().equalsIgnoreCase("M") && person.getAge()>18;
    }

    private static Predicate<Person> checkAge(Integer age) {
        return person -> person.getAge() > age;
    }
}

