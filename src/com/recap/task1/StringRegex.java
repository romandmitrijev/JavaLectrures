package com.recap.task1;

import java.util.Scanner;

public class StringRegex {
    public static void main(String[] args) {

        System.out.println("Welcome stranger. Please enter your full name");

        Scanner scaner = new Scanner(System.in);

        String userInput = scaner.nextLine();
        String changedString = userInput.replaceAll("(?i)James Bond", "007");

        if (userInput.equalsIgnoreCase(changedString)){
            System.out.println("You are not an agent. Get out!");
        }else{
            System.out.println("Welcome "+changedString);
        }



    }
}
