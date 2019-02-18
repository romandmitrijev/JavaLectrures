package com.advancedFeatures.stream.four;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

    //stream filtering
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");
        List<String> namesStartingWithA = names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());

        List<String> namesContainsH = names.stream().filter(s -> s.contains("h")).collect(Collectors.toList());

        System.out.println(namesStartingWithA);
        System.out.println(namesContainsH);

    }
}
