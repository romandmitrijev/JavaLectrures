package com.lectureSecondPart.tst;

public class Bus extends Vehicle {

    @Override
    void ride() {
        super.ride();
        System.out.println("Bus flies");
        super.ride();
    }
}
