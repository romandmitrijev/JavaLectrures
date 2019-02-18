package com.advancedFeatures.concurrency.six;

public class Example {
    public static void main(String[] args) {
        Account account = new Account();
        BankThread bankThread1 = new BankThread(account, "T1");
        BankThread bankThread2 = new BankThread(account, "T2");
        BankThread bankThread3 = new BankThread(account, "T3");
        bankThread1.start();
        bankThread2.start();
        bankThread3.start();

    }
}

