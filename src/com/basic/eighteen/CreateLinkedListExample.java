package com.basic.eighteen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();

        friends.add("Mohsen");
        friends.add("Baris");
        friends.add("Sander");
        friends.add("Karu");

        System.out.println(friends);

        friends.add(3, "Canberk");
        System.out.println(friends);

        friends.addFirst("Jelena");
        System.out.println(friends);

        friends.addLast("Murat");
        System.out.println(friends);

        List<String> disappearedPersonList = new ArrayList<>();
        disappearedPersonList.add("Elvis");

        friends.addAll(disappearedPersonList);
        System.out.println(friends);


    }
}
