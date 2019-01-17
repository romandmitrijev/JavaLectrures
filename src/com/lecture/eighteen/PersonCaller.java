package com.lecture.eighteen;

import java.util.ArrayList;
import java.util.List;

public class PersonCaller {
    public static void main(String[] args) {

        List<String> personList = new ArrayList<>();

        Person person = new Person("Roma", 36);
        Person person1 = new Person("Misha", 7);
        Person person2 = new Person("Dima", 35);
        Person person3 = new Person("Anton", 7);
        Person person4 = new Person("Uljana", 9);

        personList.add(person.getName() +": "+ person.getAge());
        personList.add(person1.getName() +": "+ person1.getAge());
        personList.add(person2.getName() +": "+ person2.getAge());
        personList.add(person3.getName() +": "+ person3.getAge());
        personList.add(person4.getName() +": "+ person4.getAge());


        System.out.println(personList);


    }
}
