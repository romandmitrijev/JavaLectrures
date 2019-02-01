package com.lectureSecondPart.one;


public class TransferMoney {
    private  String nameOfBank = "name";

    public void transferMoney(String name, int money) {
        System.out.println("Transfer money start");
        boolean check = check(name);
        if (check) {
            transfer();
        } else {
            reject();
        }
    }
    private void reject() {
        System.out.println("Rejecting");
    }
    private void transfer() {
        System.out.println("Transferring");
    }
    private boolean check(String name) {
        return name.length() >= 5;
    }
}

class Test{
    public static void main(String[] args) {
        TransferMoney tr = new TransferMoney();
        tr.transferMoney("Roman", 120);
    }
}