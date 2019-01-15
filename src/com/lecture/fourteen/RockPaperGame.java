package com.lecture.fourteen;

import java.util.Random;
import java.util.Scanner;

public class RockPaperGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Rock, Paper, Scissors game.");
        System.out.println("Please enter how many wins needed to win a series (1-5)");
        Scanner scanner = new Scanner(System.in);
        int numberOfWins = scanner.nextInt();

        Random random = new Random();
        RockPaperGameUtilities rockPaperGameUtilities = new RockPaperGameUtilities();
        int counter = 0;
        while (rockPaperGameUtilities.userWins < numberOfWins && rockPaperGameUtilities.pcWins < numberOfWins) {
            System.out.println("Please select yours: 1 - Rock, 2 - Paper, 3 - Scissors");
            int userSelection = scanner.nextInt();
            int randomNumber = random.nextInt(3) + 1;
            rockPaperGameUtilities.checker(userSelection, randomNumber);
            counter++;
        }
        System.out.println("Game Over. You have " + rockPaperGameUtilities.userWins + " wins." + " I have "
                + rockPaperGameUtilities.pcWins + " wins.");


    }


}
