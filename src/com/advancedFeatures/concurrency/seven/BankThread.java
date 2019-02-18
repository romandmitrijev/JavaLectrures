package com.advancedFeatures.concurrency.seven;

public class BankThread extends Thread {

    private Account account;
    private String threadName;
    public BankThread(String threadName, Account account) {
        this.threadName = threadName;
        this.account = account;
    }

    @Override
    public void run() {
        account.increment(threadName);
    }
}

