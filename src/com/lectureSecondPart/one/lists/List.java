package com.lectureSecondPart.one.lists;

public abstract class List {
    private String name;

    public abstract void add(int a);

    public abstract void remove(int a);

    public abstract void print();

    public void someInfo(){
        System.out.println("Important information");
    }
}
