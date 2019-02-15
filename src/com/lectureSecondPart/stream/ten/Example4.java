package com.lectureSecondPart.stream.ten;

import java.util.Arrays;
import java.util.List;

public class Example4 {

    //sum all elements greater than 10 in the list
    public static void main(String[] args) {
        Integer[] numArr = new Integer[]{10, 20, 30, 40};
        List<Integer> numList = Arrays.asList(numArr);
        System.out.println(sumStream(numList));
    }

    private static int sumStream(List<Integer> list) {
        return list.stream().filter(integer -> integer>10).mapToInt(integer->integer).sum();
    }
}
