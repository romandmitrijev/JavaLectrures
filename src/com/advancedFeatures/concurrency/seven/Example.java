package com.advancedFeatures.concurrency.seven;

public class Example {

    public static void main(String[] args) {
        Account account = new Account();
        BankThread counterThread1 = new BankThread("T1", account);
        BankThread counterThread2 = new BankThread("T2", account);
        BankThread counterThread3 = new BankThread("T3", account);
        counterThread1.start();
        counterThread2.start();
        counterThread3.start();
    }
}
