package com.recap.task12;

import java.util.Scanner;

public class DogMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your dog name");
        String dogName = scanner.next();
        dog.setName(dogName);

        while (true) {
            System.out.println("Enter dog age");
            int dogAge = scanner.nextInt();
            if (dogAge < 0) {
                System.out.println("Dog age can't be negative");
            } else {
                dog.setAge(dogAge);
                break;
            }
        }
        while (true) {
            System.out.println("Enter dog species");
            String dogSpecies = scanner.next();
            if (dogSpecies.equalsIgnoreCase("Beagle") || dogSpecies.equalsIgnoreCase("Husky" )
            || dogSpecies.equalsIgnoreCase("Chihuahua")) {
                dog.setSpecies(dogSpecies);
                break;
            } else {
                System.out.println("Dog is not Beagle or Chihuahua or Husky");
            }
        }
     dog.print();

    }

}
