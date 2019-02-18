package com.advancedFeatures.banks;

public abstract class Bank {
    String name;
    int amountCustomers;

    public abstract void openAccount();

    public void printInformation(){
        System.out.println(name);
        System.out.println("Amount of customers: "+amountCustomers);
    }
}
