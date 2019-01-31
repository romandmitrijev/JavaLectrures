package com.recap.task8;

import com.lecture.twelve.SuperMarketUtilities;

import java.util.Scanner;

public class HomeworkEight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome stranger.");

        System.out.println("Please enter number 1");
        double firstNumber = scanner.nextDouble();
        SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
        double newFirstNumber = superMarketUtilities.round(firstNumber);

        System.out.println("Please enter number 2");
        double secondNumber = scanner.nextDouble();
        double newSecondNUmber = superMarketUtilities.round(secondNumber);

        double multiplyResult = newFirstNumber*newSecondNUmber;
        if (multiplyResult<1000){
            System.out.println("Below 1000");
        }else if (multiplyResult>1000 && multiplyResult<2000){
            System.out.println("Between 1000 and 2000");
        }else{
            System.out.println("Above 2000");
        }

    }
}
