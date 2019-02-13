package com.lectureSecondPart.one.concurrency.seven;

import java.util.concurrent.atomic.AtomicInteger;

public class Account {
    private AtomicInteger uniqueId = new AtomicInteger();

    public void increment(String threadName){
        System.out.println("Before the increment, thread name:"+ threadName +
                " ,uniq id :" + getUniqueId());
        System.out.println("increment part, thread name:"+ threadName +
                ",uniq id: " + uniqueId.incrementAndGet());
        System.out.println("After the increment, thread name:"+ threadName +
                ",uniq id: " + getUniqueId());
    }

    public int getUniqueId() {
        return uniqueId.get();
    }
}
