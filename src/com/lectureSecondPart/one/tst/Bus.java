package com.lectureSecondPart.one.tst;

public class Bus extends Vehicle {

    @Override
    void ride() {
        super.ride();
        System.out.println("Bus flies");
        super.ride();
    }
}
