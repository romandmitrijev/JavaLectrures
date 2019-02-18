package com.recap.task16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        List<String> listOfStudents = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your school");

        while (true) {
            System.out.println("What do you want to do? Add/ Remove/ Done/ View/ Search");
            String userInput = scanner.next();

            if (userInput.equalsIgnoreCase("add")) {
                System.out.println("Enter student name");
                String name = scanner.next();
                listOfStudents.add(name);
                System.out.println(name + " is added.");

            } else if (userInput.equalsIgnoreCase("remove")) {
                System.out.println("Enter student name");
                String name = scanner.next();
                if (!listOfStudents.contains(name)) {
                    System.out.println("There is no such name");
                } else {
                    listOfStudents.remove(name);
                    System.out.println(name + " is removed.");
                }

            } else if (userInput.equalsIgnoreCase("done")) {
                System.out.println("Exiting.");
                break;

            } else if (userInput.equalsIgnoreCase("View")) {
                System.out.println(listOfStudents);

            } else if (userInput.equalsIgnoreCase("Search")) {
                System.out.println("Enter student name");
                String name = scanner.next();
                int totalFound = 0;
                for (int i = 0; i < listOfStudents.size(); i++) {
                    if (listOfStudents.contains(name)) {
                        totalFound++;
                    }
                    System.out.println("Total occurrences " + totalFound);
                }
            } else {
                System.out.println("Invalid command");
            }
        }
    }

}