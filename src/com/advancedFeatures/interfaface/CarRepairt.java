package com.advancedFeatures.interfaface;

public class CarRepairt extends Service {

    public CarRepairt(String name, int employees) {
        this.name = name;
        this.employesAmount = employees;
    }

    @Override
    public void repair() {
        System.out.println("Complex repair");
        if (employesAmount<2){
            System.out.println("Not enough employees");
        }
    }

    @Override
    public void paint() {
        System.out.println("Car can be colored");
    }
}
