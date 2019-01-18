package com.lecture.nineteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuperMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        Product product = new Product();

        System.out.println("Welcome admin.");
        while (true) {
            System.out.println("What do you want to do: Add, Remove, Done ?");
            String customerInput = scanner.next();
            if (customerInput.equalsIgnoreCase("done")) {
                System.out.println("Product adding finished");
                break;

            } else if (customerInput.equalsIgnoreCase("add")) {
                System.out.println("Please enter product name:");
                String inputName = scanner.next();
                if (productList.isEmpty() || !productList.contains(inputName)) {
                    product.setProductName(inputName);
                    System.out.println("Please enter Price for " + inputName);
                    double inputPrice = scanner.nextDouble();
                    product.round(inputPrice);
                    product.setProductPrice(inputPrice);
                    productList.add(product);
                } else {
                    System.out.println(inputName + " already exists");
                }

            } else if (customerInput.equalsIgnoreCase("remove")) {
                System.out.println("Please enter product you would like to remove");
                String customerRemoveInput = scanner.next();
                if (!productList.contains(customerRemoveInput)) {
                    System.out.println("This item does not exist in the list");
                } else {
                    int itemIndex = productList.indexOf(customerRemoveInput);
                    productList.remove(itemIndex);
                }
            } else {
                System.out.println("Wrong command.");
            }
        }
    }
}
