package com.recap.task14;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        System.out.println("Welcome stranger");
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.next();

        if (userInput.matches("[0-9.,]*")) {
            System.out.println("This is number");
        } else {
            System.out.println("it's not a number");
        }
    }
}
