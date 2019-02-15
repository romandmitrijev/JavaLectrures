package com.lectureSecondPart.stream.nine;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example {
    //sorted method
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", "Smith", 20),
                new Person("Sarah", "Connor", 30));
        people.stream().sorted(Comparator.comparing(Person::getSurname)).
                forEach(person -> System.out.println(person.getSurname()));
    }
}
