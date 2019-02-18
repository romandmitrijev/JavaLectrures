package com.advancedFeatures.lists;

public class FloatList extends List<Number> {
    private int lastIndex = 0;
    private float[] arr = new float[100];

    @Override
    public void add(int a) {
        arr[lastIndex] = a;
        lastIndex++;
    }

    @Override
    public void remove(int a) {
        for (int counter = 0; counter < arr.length; counter++)
            if (arr[counter] == a) {
                for (int counter1 = counter; counter1 < arr.length; counter1++) {
                    arr[counter1] = arr[counter1 + 1];
                }
            } lastIndex--;

    }
    @Override
    public void print() {
        for (int counter = 0; counter < lastIndex; counter++) {
            System.out.println(arr[counter]);
        }
    }

}