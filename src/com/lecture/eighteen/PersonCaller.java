package com.lecture.eighteen;

import java.util.ArrayList;
import java.util.List;


public class PersonCaller {

    /**
     * List<String> personList = new ArrayList<>();
     *         Person person = new Person("Dmitri", 35);
     *         Person person1 = new Person("Roman", 36);
     *         Person person2 = new Person("Jelena",25);
     *         Person person3 = new Person("Asli",25);
     *         Person person4 = new Person("Murat",30);
     *
     *         personList.add(person.getName() +" "+ person.getAge());
     *         personList.add(person1.getName() +" "+ person1.getAge());
     *         personList.add(person2.getName() +" "+ person2.getAge());
     *         personList.add(person3.getName() +" "+ person3.getAge());
     *         personList.add(person4.getName() +" "+ person4.getAge());
     *         System.out.print(personList);
     *
     */

    public static void main(String[] args) {



        List<Person> personList = new ArrayList<>();

        Person person = new Person("Roma", 36);
        Person person1 = new Person("Misha", 7);
        Person person2 = new Person("Dima", 35);
        Person person3 = new Person("Anton", 7);
        Person person4 = new Person("Uljana", 9);

        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        for (Person someone : personList) {
            System.out.println(someone.getName() + " " + someone.getAge());
        }


    }
}
