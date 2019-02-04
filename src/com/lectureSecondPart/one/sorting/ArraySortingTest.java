package com.lectureSecondPart.one.sorting;

public class ArraySortingTest {
    public static void main(String args[]) {
        ArraySorting arraySorting = new BubbleSorting();
        ArraySorting arraySorting1 = new QuickSort();

        int arr[] = {10, 7, 8, 9, 1, 5};
        arraySorting.sort(arr);

        System.out.println("Bubble sorted array");
        arraySorting.printArray(arr);

        int arr1[] = {10, 7, 8, 9, 1, 5};
        arraySorting1.sort(arr1);
        System.out.println("Quick sorted array");
        arraySorting.printArray(arr1);
    }

}
