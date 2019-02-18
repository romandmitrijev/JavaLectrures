package com.advancedFeatures.tst;

public class Car extends Vehicle {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    void ride() {
        super.ride();
        System.out.println("Car"+name+" is riding");
    }
}
