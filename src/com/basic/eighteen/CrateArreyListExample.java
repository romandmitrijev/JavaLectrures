package com.basic.eighteen;

import java.util.ArrayList;
import java.util.List;

/**
 * Add animals
 * dog, cat, tiger, bear, monkey
 * print
 * <p>
 * Does donkey exist = print error.
 * print
 * <p>
 * add the eagle on the 4th index.
 * print
 * <p>
 * create a new list
 * put all the items of the animal list to this new list.
 */

public class CrateArreyListExample {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("tiger");
        animals.add("donkey");
        animals.add("monkey");
        System.out.println(animals);

        if (animals.contains("donkey")) {
            System.out.println("Why there is no donkey in the ArrayList");
        }
        System.out.println(animals);

        animals.add(4, "eagle");
        System.out.println(animals);

        List<String> newAnimalList = new ArrayList<>();
        newAnimalList.addAll(animals);

    }
}
