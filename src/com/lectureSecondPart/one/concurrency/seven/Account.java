package com.lectureSecondPart.one.concurrency.seven;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private AtomicInteger uniqueId = new AtomicInteger();
    private Lock lock = new ReentrantLock();


    public void increment(){
        uniqueId.incrementAndGet();
    }

    public int getUniqueId() {
        return uniqueId.get();
    }
}
