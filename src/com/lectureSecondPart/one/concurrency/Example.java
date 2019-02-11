package com.lectureSecondPart.one.concurrency;

public class Example {
    public static void main(String[] args) {

        Bench bench = new Bench(10);
        SeatTakerThread seatTakerThread1 = new SeatTakerThread(bench);
        SeatTakerThread seatTakerThread2 = new SeatTakerThread(bench);
        seatTakerThread1.start();
        seatTakerThread2.start();
    }
}
