package com.lectureSecondPart.exceptions;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (CustomException e) {
            System.out.println("bla bla bla " + e.getMessage());
        }
    }

    static void doSomething() throws CustomException {
        dodDividing();
    }

    static void dodDividing() throws CustomException {
        int a = 100;
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value == 0) {
            throw new CustomException("Dividing bad");
        }
        int result = a / value;
        System.out.println(result);
    }
}
