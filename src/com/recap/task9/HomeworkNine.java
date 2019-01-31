package com.recap.task9;

import java.util.Scanner;
//done*
public class HomeworkNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome stranger.");

        System.out.println("Please enter string.");
        String userInput = scanner.nextLine();

        System.out.println("Write a char to search in the string");
        String userChar = scanner.next();
        int count = userInput.length() - userInput.replace(userChar, "").length();
        System.out.println("Result: "+count);
    }
}
