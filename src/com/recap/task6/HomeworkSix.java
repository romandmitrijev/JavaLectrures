package com.recap.task6;

import java.util.Scanner;

public class HomeworkSix {
    private static void printArray(String[] anArray, int index) {
        System.out.println(anArray[index]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome stranger.");
        while (true) {
            System.out.println("Enter the sentence. If you are done write Done");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("done")) {
                break;
            } else {
                String[] words = userInput.split(" ");
                printArray(words, 0);
            }

        }
    }

}

