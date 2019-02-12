package com.lectureSecondPart.one.concurrency.six;

public class Example {
    public static void main(String[] args) {
        Account account = new Account();
        BankThread bankThread1 = new BankThread(account);
        BankThread bankThread2 = new BankThread(account);
        BankThread bankThread3 = new BankThread(account);
        bankThread1.start();
        System.out.println("Account: " + account.getUniqueId());
        bankThread2.start();
        System.out.println("Account: " + account.getUniqueId());
        bankThread3.start();
        System.out.println("Account: " + account.getUniqueId());
    }
}
