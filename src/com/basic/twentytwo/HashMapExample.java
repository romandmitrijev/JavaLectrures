package com.basic.twentytwo;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> numberMapping = new HashMap<>();
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);
        numberMapping.putIfAbsent("Four", 4);
        System.out.println(numberMapping);

        String input = "One";
        if (numberMapping.containsKey(input)) {
            //Get the value assigned to a given key in the HashMap
            int value = numberMapping.get(input);
            System.out.println(input + " is " + value);
        } else {
            System.out.println("No value for " + numberMapping);
        }

        if (numberMapping.containsValue(1)){
            System.out.println("There is a key for value 1");
        }else {
            System.out.println("There is no key for value 1");
        }
        numberMapping.put("One", 3);
        System.out.println(numberMapping);

        for (Map.Entry<String, Integer> entry: numberMapping.entrySet()){
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }

        numberMapping.remove("One");
        System.out.println(numberMapping);
        boolean isRemoved = numberMapping.remove("Two", 3);

        if (isRemoved){
            System.out.println("It is removed");
        }else {
            System.out.println("It doesn't exist");
        }
    }
}
