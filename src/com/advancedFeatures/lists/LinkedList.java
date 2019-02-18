package com.advancedFeatures.lists;

public class LinkedList extends List<Number> {
    Element first;


    @Override
    public void add(int a) {
        Element element = new Element();
        element.value = a;
        element.next = first;
        first = element;
    }

    @Override
    public void remove(int a) {
        if (first.value == a) {
            first = first.next;
            return;
        }
        Element previous = first;
        Element current = previous.next;
        while (current != null) {
            if (current.value == a) {
                previous.next = current.next;
                break;
            }
            previous = current;
            current = current.next;
        }

    }

    @Override
    public void print() {
        Element tmp = first;
        while (tmp != null) {
            System.out.println(tmp);
            tmp = tmp.next;
        }

    }

    public static void main(String[] args) {
        List<Number> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.print();
        list.add(5);
        list.print();
    }
}

class Element {
    int value;
    Element next;
}

