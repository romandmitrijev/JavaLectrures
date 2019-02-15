package com.lectureSecondPart.interfaface;

public class BycileRepair extends Service {

    public BycileRepair(String name, int employees) {
        this.name = name;
        this.employesAmount = employees;
    }

    @Override
    public void repair() {
        System.out.println("Repair can be done with a single employee");
        }

    @Override
    public void paint() {
        System.out.println("Coloring can be done");
    }
}
