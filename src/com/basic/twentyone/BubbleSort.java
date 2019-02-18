package com.basic.twentyone;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int numberArrays[] = {6,2,8,1,5,3,4,7};

        System.out.println(Arrays.toString(numberArrays));
        System.out.println();

        for (int counter = 0; counter < numberArrays.length-1; counter++)
            for (int counter1 = 0; counter1 < numberArrays.length-counter-1; counter1++)
                if (numberArrays[counter1] > numberArrays[counter1+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = numberArrays[counter1];
                    numberArrays[counter1] = numberArrays[counter1+1];
                    numberArrays[counter1+1] = temp;
                }
        System.out.println("Array after bubble sort");
        System.out.println(Arrays.toString(numberArrays));
    }

}
