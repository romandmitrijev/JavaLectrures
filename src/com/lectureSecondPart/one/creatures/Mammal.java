package com.lectureSecondPart.one.creatures;

public class Mammal extends Creatures {

    @Override
    void breath() {
        super.breath();
        System.out.println("Mammal breath with fresh air");
    }
}
