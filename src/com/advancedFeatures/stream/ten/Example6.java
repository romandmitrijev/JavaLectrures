package com.advancedFeatures.stream.ten;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example6 {
    //convert list to map
    //get list of Animal
    //convert list to map, id is key object is a value
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(1, "Cat"));
        animals.add(new Animal(2, "Dog"));
        animals.add(new Animal(3, "Cow"));
        animals.add(new Animal(4, "Bird"));

        System.out.println(convertListAfterJava8(animals));
    }

    private static Map<Integer, Animal> convertListAfterJava8(List<Animal> list) {
    Map<Integer, Animal> map = list.stream()
            .collect(Collectors.toMap(Animal::getId, animal -> animal));
    return map;

    }

}
