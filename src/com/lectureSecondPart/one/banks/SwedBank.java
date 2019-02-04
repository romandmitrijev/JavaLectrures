package com.lectureSecondPart.one.banks;

public class SwedBank extends Bank {

    public SwedBank(String name) {
        this.name = name;
        this.amountCustomers = 0;
    }
    
    @Override
    public void openAccount() {
        if (amountCustomers>4){
            System.out.println("Sorry");
        }else{
            System.out.println("Opening account in Swed");
            this.amountCustomers +=1;
        }
    }
}
