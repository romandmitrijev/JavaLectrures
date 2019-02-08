package com.recap.task13;

import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome stranger");

        System.out.println("Which word you want to encrypt");
        String wordToEncrypt = scanner.nextLine();

        System.out.println("Which word you want to change to");
        String wordToChangeTo = scanner.nextLine();

        System.out.println("What is the sentence");
        String sentence = scanner.nextLine();

        System.out.println(sentence);
        if (sentence.contains(wordToEncrypt)) {
            sentence = sentence.replaceAll(wordToEncrypt, wordToChangeTo);
            System.out.println(sentence);
        } else {
            System.out.println("There is to change in this sentence");
        }
    }
}