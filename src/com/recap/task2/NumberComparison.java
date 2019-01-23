package com.recap.task2;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome stranger. Please enter number one");
        int numberOne = scanner.nextInt();

        System.out.println("Please enter number two");
        int numberTwo = scanner.nextInt();

        if (numberOne == numberTwo) {
            System.out.println("You have entered 2 numbers: " + numberOne + "-" + numberTwo + " They are same.");
        } else if (numberOne > numberTwo) {
            System.out.println("You have entered 2 numbers: " + numberOne + "-" + numberTwo + " Bigger number: " + numberOne);
        } else {
            System.out.println("You have entered 2 numbers: " + numberOne + "-" + numberTwo + " Bigger number: " + numberTwo);
        }

    }
}
