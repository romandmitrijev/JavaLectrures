package com.lectureSecondPart.tst;

public class Vehicle {
    private int maxSpeed;
    private int numSeats;
    private String fuelType;

    protected void veryPrivateMethod(){

    }

    void ride(){
        System.out.println("Just riding it");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
