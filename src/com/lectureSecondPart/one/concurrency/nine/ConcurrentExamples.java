package com.lectureSecondPart.one.concurrency.nine;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentExamples {
    public static void main(String[] args) {
        Map<Integer, String> nonThreadSafe = new HashMap<>();

        nonThreadSafe.put(1, "Adam");
        nonThreadSafe.put(2, "John");
        nonThreadSafe.put(3, "Eva");
        System.out.println(nonThreadSafe);

        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(nonThreadSafe);
        System.out.println("Map after synchronization");
        System.out.println(synchronizedMap);

        Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<>(nonThreadSafe);
        System.out.println("Concurrent map");
        System.out.println(concurrentHashMap);
    }
}
