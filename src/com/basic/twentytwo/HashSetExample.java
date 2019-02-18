package com.basic.twentytwo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> daysOfWeek = new HashSet<>();

        //Add new element to HashSet
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        //Adding duplicate element will be ignored
        daysOfWeek.add("Monday");

        System.out.println(daysOfWeek);
        //--------------------------------------
        Set<String> anotherSet = new HashSet<>();
        anotherSet.addAll(daysOfWeek);
        System.out.println(anotherSet);

        //------------------------------------------
        if (anotherSet.contains("Monday")){
            System.out.println("Monday exist in the set");
        }else{
            System.out.println("Monday is not present in the set");
        }

        //-----------------------------------------
        for (String days: anotherSet){
            System.out.println(days);
        }

        //-----------------------------------------
        anotherSet.remove("Monday");
        System.out.println(anotherSet);

        List<String> moreDays = new ArrayList<>();
        moreDays.add("Friday");
        moreDays.add("Sunday");
        anotherSet.removeAll(moreDays);
        System.out.println(anotherSet);


    }
}
