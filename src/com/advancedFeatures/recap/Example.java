package com.advancedFeatures.recap;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example {
    public static void main(String[] args) throws IOException {
        String fileLocation = "C://test.txt";
        try {
            List<String> lines  = Files.readAllLines(Paths.get(fileLocation), Charset.forName("UTF-8"));
            for (String line:lines){
                System.out.println(line);
            }
            Set<String> myUniqueElement = new HashSet<>(lines);
            System.out.println(myUniqueElement);

        }catch (FileNotFoundException fne){
            System.out.println("File not found");
        }
        catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
