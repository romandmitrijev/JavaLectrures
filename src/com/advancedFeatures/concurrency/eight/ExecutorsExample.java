package com.advancedFeatures.concurrency.eight;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future<String> future = (Future<String>) executorService.submit(new SleepTask());

        System.out.println(future.get());

    }
}
