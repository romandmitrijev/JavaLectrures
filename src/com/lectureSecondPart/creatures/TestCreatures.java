package com.lectureSecondPart.creatures;

public class TestCreatures {
    public static void main(String[] args) {
        Creatures[] creatures = new Creatures[]{
                new Fish(),
                new Mammal(),
                new Worm()
        };
        theyAllBreath(creatures);
    }

    private static void theyAllBreath(Creatures[] all) {
        for (Creatures creatures: all) {
            creatures.breath();
        }
    }
}
