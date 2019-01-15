package com.lecture.fourteen;

public class RockPaperGameUtilities {
    String[] names = {"Rock", "Paper", "Scissors"};
    int userWins = 0;
    int pcWins = 0;


    public void checker(int userSelection, int randomNumber) {
        if (userSelection > 3) {
            System.out.println("You can use only 1-3");
        } else if (userSelection == randomNumber) {
            System.out.println("It's draw, mine was also " + names[randomNumber - 1]);
        } else if (userSelection == 1 && randomNumber == 3) {
            System.out.println("You win 1 point, mine was " + names[randomNumber - 1]);
            userWins++;
        } else if (userSelection == 2 && randomNumber == 1) {
            System.out.println("You win 1 point, mine was " + names[randomNumber - 1]);
            userWins++;
        } else if (userSelection == 3 && randomNumber == 2) {
            System.out.println("You win 1 point, mine was " + names[randomNumber - 1]);
            userWins++;
        } else {
            System.out.println("You loose, 1 point for me. I had " + names[randomNumber - 1]);
            pcWins++;
        }

    }
}
