package com.advancedFeatures.lists;

public abstract class List<I extends Number> {
    private String name;

    public abstract void add(int a);

    public abstract void remove(int a);

    public abstract void print();

    public void someInfo(){
        System.out.println("Important information");
    }
}
