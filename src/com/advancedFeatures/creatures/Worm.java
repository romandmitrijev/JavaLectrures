package com.advancedFeatures.creatures;

public class Worm extends Creatures {

    @Override
    void breath() {
        super.breath();
        System.out.println("Worm breath with their skin");
    }
}
