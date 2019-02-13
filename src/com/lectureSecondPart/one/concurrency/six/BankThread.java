package com.lectureSecondPart.one.concurrency.six;

public class BankThread extends Thread {
    private Account account;
    private String threadName;

    public BankThread(Account account, String threadName) {
        this.account = account;
        this.threadName = threadName;

    }

    @Override
    public void run() {
        account.increment(threadName);

    }
}
