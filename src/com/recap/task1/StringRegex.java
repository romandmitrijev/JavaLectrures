package com.recap.task1;

import java.util.Scanner;
//done
public class StringRegex {
    public static void main(String[] args) {
        System.out.println("Welcome stranger. Please enter your full name");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if (!userInput.equalsIgnoreCase("James Bond")){
            System.out.println("You are not an agent. Get out!");
        }else{
            System.out.println("Welcome 007");
        }
    }
}
