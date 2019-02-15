package com.lectureSecondPart.collections;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        Integer integer = list.get(0);
//        list.remove(0);
//        list.size();
//
//        for (Integer i : list) {
//            System.out.println(i);
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        //6765
//        Integer febOne = 1;
//        Integer febTwo = 1;
//        list.add(febOne);
//        list.add(febTwo);
//        for (int i = 2; i < 20; i++) {
//            Integer toAdd = list.get(i - 1) + list.get(i - 2);
//            list.add(toAdd);
//        }
//        System.out.println(list);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number to add into Array. Press 0 to finish");
        while (true) {
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            } else {
                list.add(userInput);
            }
        }
        List<Integer> listToPrint = new ArrayList<>();
        for (Integer integer : list) {
            if (!listToPrint.contains(integer)) {
                listToPrint.add(integer);
            }
        }

        System.out.println(list);
        System.out.println(listToPrint);

//        for (Integer integer : listToPrint) {
//            int occurrences = 0;
//            for (int i = 0; i < list.size(); i++) {
//                if (list.get(i)==)
//                    occurrences++;
//            }
//            System.out.println(integer + ":" + occurrences);
//        }

    }




}
