package com.lecture.nineteen;


import java.util.Scanner;

public class SuperMarketApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome admin.");
        SuperMarket superMarket = new SuperMarket();
        SuperMarketApplication superMarketApplication = new SuperMarketApplication();

        while (true) {
            System.out.println("What do you want to do: Add, Remove, Done ?");
            String userInput = scanner.next();
            if (userInput.equalsIgnoreCase("add")) {
                superMarketApplication.addNewProduct(superMarket);

            } else if (userInput.equalsIgnoreCase("remove")) {
                superMarketApplication.removeProduct(superMarket);

            } else if (userInput.equalsIgnoreCase("done")) {
                System.out.println("Product adding is finished");
                break;

            } else {
                System.out.println("Invalid command");
            }


        }

        superMarket.printAllProducts();
        System.out.println("Please enter your budget");
        double budget = scanner.nextDouble();
        com.lecture.nineteen.Account account = new Account(budget);
        System.out.println("Your budget is " + account.getBalance());

        while (true) {
            System.out.println("What do you want to buy (done = finished buying)");
            String requestedItem = scanner.next();
            if (requestedItem.equalsIgnoreCase("done")) {

                break;
            }
            int locatedIndex = superMarket.getIndexOfProduct(requestedItem);
            if (locatedIndex == -1) {
                System.out.println("This item does not exists");
            } else {
                SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
                Product selectedProduct = superMarket.getListOfProducts().get(locatedIndex);
                System.out.println("How many of" + selectedProduct + " do you want");

                int requestedQuantity = scanner.nextInt();

                double totalCost = selectedProduct.getPrice() * requestedQuantity; // can be done as * (new Double(requestedQuantity)
                totalCost = superMarketUtilities.round(totalCost);
                account.deduct(totalCost);
                boolean isEnoughMoney = account.deduct(totalCost);
                if (isEnoughMoney) {
                    account.addUpdateProducts(selectedProduct.getName(),requestedQuantity);
                }


            }
        }
        account.printAccountInfo();

    }

    /**
     * This will try to add new product to the super market
     */
    private void addNewProduct(SuperMarket superMarket) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product name:");
        String incomingProductName = scanner.next();
        // This will return either -1 or index of a product in list
        int indexOfProduct = superMarket.getIndexOfProduct(incomingProductName);
        if (indexOfProduct == -1) {
            System.out.println("Please enter product price:");
            double incomingPrice = scanner.nextDouble();
            SuperMarketUtilities superMarketUtilities = new SuperMarketUtilities();
            incomingPrice = superMarketUtilities.round(incomingPrice);

            Product insertableProduct = new Product(incomingProductName, incomingPrice);

            //We are good to go, there is no product with this name
            superMarket.insertProduct(insertableProduct);



        } else {
            System.out.println("This product already exists.");
        }
    }

    private void removeProduct(SuperMarket superMarket) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product to remove: ");
        superMarket.printAllProducts();
        String incomingProductName = scanner.next();
        int indexOfProduct = superMarket.getIndexOfProduct(incomingProductName);
        if (indexOfProduct != -1) {
            superMarket.removeProduct(indexOfProduct);

        } else {
            System.out.println("This product does not exist in the list.");
        }


    }
}