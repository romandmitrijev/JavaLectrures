package com.lectureSecondPart.one.concurrency.six;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private int uniqueId;
    private Lock lock = new ReentrantLock();

    public synchronized int getUniqueId() {
        return uniqueId;
    }

    public void increment(){
        lock.lock();
        uniqueId++;
        lock.unlock();
    }
}
