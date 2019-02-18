package com.basic.seventeen;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stackOfCards = new Stack<>();
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println(stackOfCards);

        String theLastInfo = stackOfCards.pop();
        System.out.println(theLastInfo);

        String cardAtTop = stackOfCards.peek();
        System.out.println(cardAtTop);
        System.out.println(stackOfCards);


    }

}
