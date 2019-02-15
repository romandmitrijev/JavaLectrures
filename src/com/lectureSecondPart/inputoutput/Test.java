package com.lectureSecondPart.inputoutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("test.txt");

        List<String> strings = Files.readAllLines(path);
        for (String line: strings) {
            System.out.println(line);
        }

        List<String> list = new ArrayList<>();
        list.add("Roman");
        list.add("Dima");
        list.add("Basaran");
        list.add("Roman");

        Files.write(path, list, StandardOpenOption.APPEND);
    }
}
