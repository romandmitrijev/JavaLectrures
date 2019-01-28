package com.recap.task7;

import java.util.Scanner;

public class HomeworkSeven {
    private static void printArray(String[] anArray, int index) {
        System.out.println(anArray[index]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome stranger.");
        while (true) {
            System.out.println("Enter the sentence. If you are done write Done.");
            String userInput = scanner.nextLine(); // variable is not empty after 1st loop
            if (userInput.equalsIgnoreCase("done")) {
                break;
            } else {
                String[] words = userInput.split(" ");
                System.out.println("Which order of sentence you want to print?");

                int orderInput = scanner.nextInt();
                if (orderInput > words.length) {
                    System.out.println("Sentence does not have this much of words.");
                } else if (orderInput < 1) {
                    System.out.println("We don't accept 0 or negative numbers");
                } else {
                    printArray(words, (orderInput - 1));
                }

            }

        }
    }
}
