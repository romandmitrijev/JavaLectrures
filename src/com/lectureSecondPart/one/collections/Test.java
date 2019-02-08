package com.lectureSecondPart.one.collections;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        Integer integer = list.get(0);
        list.remove(0);
        list.size();

        for (Integer i : list) {
            System.out.println(i);
        }

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //6765
        Integer febOne = 1;
        Integer febTwo = 1;
        for (int i = 0; i<=20; i++){
            list.add(febOne);

        }
    }
}
