package com.basic.twentytwo;

import java.util.HashSet;
import java.util.Set;

public class HashSetUserDefinedObjectExample {
    public static void main(String[] args) {

        Set<Customer> objectHashSet = new HashSet<>();

        objectHashSet.add(new Customer(1,"Roman"));
        objectHashSet.add(new Customer(2,"Dima"));
        objectHashSet.add(new Customer(3,"Murat"));

        /*
        HasSet will use the 'equals()'&'hashCode()' implementations
        of the Customer class to check for duplicates and ignore them
         */

        objectHashSet.add(new Customer(1, "Roman"));
        objectHashSet.remove(new Customer(2, "Dima"));
        System.out.println(objectHashSet);
        
    }
}
