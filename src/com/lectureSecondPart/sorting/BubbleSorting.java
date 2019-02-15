package com.lectureSecondPart.sorting;

public class BubbleSorting extends ArraySorting {
    @Override
    public int[] sort(int[] array) {
        for (int counter = 0; counter < array.length-1; counter++)
            for (int counter1 = 0; counter1 < array.length-counter-1; counter1++)
                if (array[counter1] > array[counter1+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = array[counter1];
                    array[counter1] = array[counter1+1];
                    array[counter1+1] = temp;
                }
        return array;
    }
}
