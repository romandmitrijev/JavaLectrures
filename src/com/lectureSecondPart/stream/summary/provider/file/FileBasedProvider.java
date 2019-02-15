package com.lectureSecondPart.stream.summary.provider.file;

import com.lectureSecondPart.stream.summary.data.Country;
import com.lectureSecondPart.stream.summary.data.Person;
import com.lectureSecondPart.stream.summary.provider.PersonDataProvider;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FileBasedProvider implements PersonDataProvider {

    private static List<Person> myPeople = new ArrayList<>();

    public void read(File file) throws IOException {
        //todo task-1: read contents of the given file

        try {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            myPeople = br.lines().skip(1).map(maptoItem).collect(Collectors.toList());
        } catch (IOException e) {
            throw new IOException("not implemented" + e);
        }
    }

    @Override
    public Collection<Person> findAll() {
        return null;//homework
    }

    @Override
    public Collection<Person> search(String firstName, String lastName, Boolean eu, int minimumAge) {
        return null;//homework
    }

    private Function<String, Person> maptoItem = (line) -> {
        String[] p = line.split(","); // a csv has comma separated
        Person person = new Person(p[0], p[1], Country.valueOf(p[2]), Integer.parseInt(p[3]));
        return person;
    };

}
