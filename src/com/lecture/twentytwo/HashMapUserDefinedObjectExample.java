package com.lecture.twentytwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedObjectExample {
    public static void main(String[] args) {
        Map<Integer, Customer> objectMapping = new HashMap<>();
        objectMapping.put(1, new Customer(1, "Roman"));
        objectMapping.put(2, new Customer(2, "Dima"));
        objectMapping.put(3, new Customer(3, "Baris"));

        System.out.println(objectMapping);

        for (Map.Entry<Integer, Customer> entry : objectMapping.entrySet()) {
            if (entry.getValue().getName().equalsIgnoreCase("Baris")) {
                System.out.println("You found him: "+entry.getKey() + " =>" + entry.getValue());
            }
        }
        ArrayList<Integer> personToBeRemoved = new ArrayList<>();
        for (Map.Entry<Integer, Customer> entry : objectMapping.entrySet()) {
            if (entry.getValue().getName().equalsIgnoreCase("Roman")) {
                personToBeRemoved.add(entry.getKey());
                System.out.println(objectMapping);
            }

        }
        for (Integer key: personToBeRemoved){
            objectMapping.remove(key);
        }
        System.out.println(objectMapping);
    }
}