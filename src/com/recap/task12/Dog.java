package com.recap.task12;

public class Dog {
    private String name;
    private int age;
    private String species;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    private void printDecision(int age, String species) {
        switch (species) {
            case "Beagle":
                if (this.age < 3) {
                    System.out.println("Dog is young");
                } else if (this.age < 6) {
                    System.out.println("Dog is adult");
                } else {
                    System.out.println("Dog is old");
                }
                break;
            case "Husky":
                if (this.age < 4) {
                    System.out.println("Dog is young");
                } else if (this.age < 7) {
                    System.out.println("Dog is adult");
                } else {
                    System.out.println("Dog is old");
                }
                break;
            case "Chihuahua":
                if (this.age < 3) {
                    System.out.println("Dog is young");
                } else if (this.age < 7) {
                    System.out.println("Dog is adult");
                } else {
                    System.out.println("Dog is old");
                }
                break;
            default:
                System.out.println("Unknown species");
        }
    }

    void print() {
        System.out.println("Dog name: " + this.name + "Dog age: " + this.age + "Dog Species: " + this.species);
        printDecision(age, species);
    }


}
