package com.lectureSecondPart.generic;

public class Test1 {

    public static void main(String[] args) {
        Box<B> stringBox = new Box<>();
        test(stringBox);
    }

    static void test(Box<? super C> box){

    }
}

class Box<T>{

}

class A{

}

class B extends A {

}

class C extends B{

}