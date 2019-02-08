package com.recap.task17;

import java.util.ArrayList;
import java.util.Scanner;

public class DogMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Welcome to dog administration");

        ArrayList<Dog> arrayList = new ArrayList<>();

        while (true) {
            System.out.println("What do you want to do? Add/Search/View/Done");
            String userAction = scanner.next();
            if (userAction.equalsIgnoreCase("done")) {
                break;

            } else if (userAction.equalsIgnoreCase("add")) {
                System.out.println("Enter dog name");
                String dogName = scanner.next();

                System.out.println("Enter dog age");
                int dogAge = scanner.nextInt();

                System.out.println("Enter dog species");
                String dogSpecies = scanner.next();

                arrayList.add(new Dog(dogName, dogAge, dogSpecies));

                System.out.println("Dog added");
                System.out.println("Dog name:" + dogName + " Dog age: " + dogAge + " Dog species:" + dogSpecies);

            } else if (userAction.equalsIgnoreCase("search")) {
                System.out.println("Enter dog name");
                String nameToSearch = scanner.next();
                for (Dog dog : arrayList) {
                    if (nameToSearch.equals(dog.getName())) {
                        System.out.println("System found the dog");
                        System.out.println("Dog name:" + dog.getName() + " Dog age: " + dog.getAge() + " Dog species:" + dog.getSpecies());
                    } else{
                        System.out.println("System didn't find the dog");
                    }
                }

            } else if (userAction.equalsIgnoreCase("view")){
                for (Dog dog : arrayList) {
                    System.out.println("Printing all dogs");
                    System.out.println("Dog name:" + dog.getName() + " Dog age: " + dog.getAge() + " Dog species:" + dog.getSpecies());
                }
            } else {
                System.out.println("No such command...");
            }

        }

    }
}
