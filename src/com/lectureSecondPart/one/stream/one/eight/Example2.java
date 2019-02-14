package com.lectureSecondPart.one.stream.one.eight;


import java.util.Arrays;
import java.util.List;

public class Example2 {
    // streams - reduce method
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,1,1);
        Integer reduced = integers.stream().reduce(23, (fromIdentity, fromList) -> fromIdentity + fromList);
        System.out.println(reduced);
    }
}
