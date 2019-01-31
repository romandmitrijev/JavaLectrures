package com.recap.task5;

import java.util.Scanner;
//done
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome stranger.");


        while (true){
            System.out.println("Please enter number for factorial. -1 is special command to exit");
            int userInput = scanner.nextInt();
            if (userInput == -1){
                break;
            }else if (userInput < 0) {
                System.out.println("Negative number. Not acceptable");
            }else {
                int result = 1;
                for(int counter=1;counter<=userInput;counter++){
                    result=result*counter;
                }
                System.out.println("Result: "+result);
            }

        }

    }
}
