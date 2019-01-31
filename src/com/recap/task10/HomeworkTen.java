package com.recap.task10;

import java.util.Scanner;

public class HomeworkTen {

    public static void main(String[] args) {
        System.out.println("Welcome stranger.");
        Scanner scanner = new Scanner(System.in);
        String[] items = {"", "", "", "", ""};

        int totalAmountOfItems = 0;

        while (true) {
            System.out.println("What operation do you want to do? Add/Remove/View/Search/Done.");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Done")) {
                break;

            } else if (input.equalsIgnoreCase("View")) {

                if (totalAmountOfItems == 0) {
                    System.out.println("Array is empty");
                }
                //Print array information.
                boolean isFirst = true;
                for (int counter = 0; counter < items.length; counter++) {
                    if (!items[counter].isEmpty()) {
                        if (isFirst) {
                            isFirst = false;
                            System.out.print(items[counter]);
                        } else {
                            System.out.print("," + items[counter]);
                        }
                    }
                }
                if(!isFirst){
                    System.out.println();
                }


            } else if (input.equalsIgnoreCase("Remove")) {
                if (totalAmountOfItems == 0) {
                    System.out.println("Array is empty Nothing to remove.");
                } else {
                    System.out.println("What item you want to remove.");
                    String itemRemoved = scanner.nextLine();

                    boolean found = false;
                    for (int counter = 0; counter < items.length; counter++) {
                        if (items[counter].equalsIgnoreCase(itemRemoved)) {
                            System.out.println("Item removed");
                            items[counter] = "";
                            found = true;
                            totalAmountOfItems--;
                        }
                    }
                    if (!found) {
                        System.out.println("Item not found");
                    }
                }


            } else if (input.equalsIgnoreCase("Add")) {
                if (totalAmountOfItems == items.length) {
                    System.out.println("Array is full. We cannot add any item.");
                } else {
                    System.out.println("What item you want to add.");
                    String itemAdded = scanner.nextLine();

                    boolean found = false;
                    for (int counter = 0; counter < items.length; counter++) {
                        if (items[counter].equalsIgnoreCase(itemAdded)) {
                            System.out.println("Item located at index " + counter + " No need to add.");
                            found = true;
                        }
                    }
                    if (!found) {
                        for (int counter = 0; counter < items.length; counter++) {
                            if (items[counter].isEmpty()) {
                                items[counter] = itemAdded;
                                totalAmountOfItems++;
                                System.out.println("Item added");
                                break;
                            }
                        }
                    }
                }


            } else if (input.equalsIgnoreCase("Search")) {
                if (totalAmountOfItems == 0) {
                    System.out.println("Array is empty Nothing to search.");
                } else {
                    System.out.println("What item you want to search.");
                    String itemSearched = scanner.nextLine();

                    boolean found = false;
                    for (int counter = 0; counter < items.length; counter++) {
                        if (items[counter].equalsIgnoreCase(itemSearched)) {
                            System.out.println("Item located at index " + counter);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Item not found");
                    }
                }
            } else {
                System.out.println("Invalid Command");
            }
        }
    }
}