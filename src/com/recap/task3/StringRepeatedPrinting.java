package com.recap.task3;

import java.util.Scanner;

public class StringRepeatedPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome stranger. Please enter String");
        String userInput = scanner.nextLine();

        for (int counter = 0; counter < userInput.length(); counter++){
            System.out.print(userInput.charAt(counter)+" ");
        }

    }
}
