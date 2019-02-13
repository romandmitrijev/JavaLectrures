package com.lectureSecondPart.one.concurrency.six;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private int uniqueId;
    private Lock lock = new ReentrantLock();


    public void increment(String threadName){
        System.out.println("Thread name:" + threadName
                + " before the lock, unique id:" + uniqueId);
        lock.lock();
        System.out.println("Thread name:" + threadName
                + " after the lock,before increment," +
                " unique id:" + uniqueId);
        uniqueId++;
        System.out.println("Thread name:" + threadName
                + " after the lock,after increment," +
                " unique id:" + uniqueId);
        lock.unlock();
        System.out.println("Thread name:" + threadName
                + " after the unlock,after increment," +
                " unique id:" + uniqueId);
    }

    public int getUniqueId() {
        return uniqueId;
    }
}
