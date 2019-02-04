package com.lectureSecondPart.one.lists;


public class ArrayList extends List {
    private int lastIndex = 0;
    private int[] arr = new int [100];

    @Override
    public void add(int a) {
        arr[lastIndex] = a;
        lastIndex++;
    }

    @Override
    public void remove(int a) {
        // homework
    }

    @Override
    public void print() {
        for (int counter = 0; counter<lastIndex;counter++){
            System.out.println(arr[counter]);
        }
    }

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(1);
        list.add(3);
        list.print();
    }
}
