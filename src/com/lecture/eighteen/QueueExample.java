package com.lecture.eighteen;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> waitingQueue = new LinkedList<>();

        ((LinkedList<String>) waitingQueue).add("Roman");
        ((LinkedList<String>) waitingQueue).add("Mohsen");
        ((LinkedList<String>) waitingQueue).add("Asli");
        ((LinkedList<String>) waitingQueue).add("Janek");

        System.out.println(waitingQueue);

        String name = waitingQueue.remove(); // The Dequeue operation
        System.out.println(name);

        name = waitingQueue.poll();
        System.out.println(name);

        System.out.println(waitingQueue);


    }
}
