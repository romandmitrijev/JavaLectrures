package com.lectureSecondPart.one.concurrency.seven;

public class Example {
    public static void main(String[] args) {
        Account account = new Account();
        BankThread bankThread1 = new BankThread(account);
        BankThread bankThread2 = new BankThread(account);
        BankThread bankThread3 = new BankThread(account);
        bankThread1.start();
        bankThread2.start();
        bankThread3.start();


    }
}
