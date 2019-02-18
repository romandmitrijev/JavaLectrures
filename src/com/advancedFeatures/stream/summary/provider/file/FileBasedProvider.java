package com.advancedFeatures.stream.summary.provider.file;

import com.advancedFeatures.stream.summary.data.Country;
import com.advancedFeatures.stream.summary.data.Person;
import com.advancedFeatures.stream.summary.provider.PersonDataProvider;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileBasedProvider implements PersonDataProvider {

    private static List<Person> myPeople = new ArrayList<>();

    public void read(File file) throws IOException {
        //todo task-1: read contents of the given file

        try {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            myPeople = br.lines().skip(1).map(mapToItem).collect(Collectors.toList());
        } catch (IOException e) {
            throw new IOException("not implemented" + e);
        }
    }

    private Function<String, Person> mapToItem = (line) -> {
        String[] p = line.split(","); // a csv has comma separated
        Person person = new Person(p[0], p[1], Country.valueOf(p[2]), Integer.parseInt(p[3]));
        return person;
    };

    @Override
    public Collection<Person> findAll() {

        return myPeople;
    }

    @Override
    public Collection<Person> search(String firstName, String lastName, Boolean eu, int minimumAge) {
        Stream<Person> peopleStream = myPeople.stream();

        if (firstName != null)
            peopleStream = peopleStream.filter(person -> person.getFirstName().equals(firstName));
        if (lastName != null)
            peopleStream = peopleStream.filter(person -> person.getLastName().equals(lastName));
        if (minimumAge > 0)
            peopleStream = peopleStream.filter(person -> person.getAge() >= minimumAge);
        if (eu != null)
            peopleStream = peopleStream.filter(person -> person.getCountry().isEu() == eu.booleanValue());

        return peopleStream.collect(Collectors.toList());

        //todo add groupByCountry, searchByName, getAvgAge
    }


}
