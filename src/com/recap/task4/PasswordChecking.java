package com.recap.task4;

import java.util.Scanner;
//done
public class PasswordChecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "password";
        String password2 = "password2";

        System.out.println("Welcome stranger. Please enter password");
        String inputPassword = scanner.next();
        if (inputPassword.equals(password)){
            System.out.println("Please enter second password");
            String secondInputPassword = scanner.next();

            if (secondInputPassword.equals(password2)){
                System.out.println("Welcome to the club");
            }else{
                System.out.println("Second password is wrong");
            }
        }else {
            System.out.println("First password is wrong");
        }

    }
}
