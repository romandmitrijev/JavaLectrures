package com.lectureSecondPart.one.banks;

public class LhvBank extends Bank {

    public LhvBank(String name) {
        this.name = name;
        this.amountCustomers = 0;
    }

    @Override
    public void openAccount() {
        System.out.println("Opening in LHV");
        this.amountCustomers = 1;
    }
}
