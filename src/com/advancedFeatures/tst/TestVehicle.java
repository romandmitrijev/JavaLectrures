package com.advancedFeatures.tst;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                new Car("First car"),
                new Bus(),
                new Car("Second car"),
                new Bicycle()
        };
        rideAllVehicles(vehicles);

    }

    public static void rideAllVehicles(Vehicle[] all) {
        for (Vehicle vehicle : all) {
            vehicle.ride();
        }
    }
}
