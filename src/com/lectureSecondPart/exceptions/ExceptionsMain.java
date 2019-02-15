package com.lectureSecondPart.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsMain {
    public static void main(String[] args) {
        int number = 100;
        int[] array = {1, 3, 5, 6, 7};

        Scanner scanner = new Scanner(System.in);
        try {
            int index = scanner.nextInt();
            int result = number / index;
            System.out.println(array[index]);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println("Unable to read with the exception. " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There is no such index in Array. " + e);
        }
    }

}
