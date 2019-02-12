package com.lectureSecondPart.one.concurrency.six;

public class BankThread extends Thread {
    private Account account;

    public BankThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.increment();
    }
}
