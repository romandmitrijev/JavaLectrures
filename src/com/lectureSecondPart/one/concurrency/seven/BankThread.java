package com.lectureSecondPart.one.concurrency.seven;

public class BankThread extends Thread {
    private Account account;

    public BankThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.increment();
        System.out.println("UniqueId: " + account.getUniqueId());
    }
}
