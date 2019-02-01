package com.lectureSecondPart.one.creatures;

public class Fish extends Creatures {

    @Override
    void breath() {
        super.breath();
        System.out.println("Fish breath in water");
    }
}
