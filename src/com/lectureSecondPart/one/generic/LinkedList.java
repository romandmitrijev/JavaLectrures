package com.lectureSecondPart.one.generic;


public class LinkedList<T extends Comparable> {

    Element<T> first;

    public void add(T a) {
        Element element = new Element();
        element.value = a;
        element.next = first;
        first = element;
    }

    public void remove(T a) {
        if (first.value.equals(a)) {
            first = first.next;
            return;
        }

        Element previous = first;
        Element current = previous.next;
        while (current != null) {

            if (current.value.equals(a)) {
                previous.next = current.next;
                break;
            }
            previous = current;
            current = current.next;
        }
    }

    public void print() {
        Element tmp = first;
        while (tmp != null) {
            System.out.print(tmp.value + ", ");
            tmp = tmp.next;
        }
        System.out.println();
    }
    public LinkedList sort () {
        boolean wasChanged;
        Element<T> current = first;
        Element<T> previous = null;
        Element<T> next = first.next;
        while (next != null) {
            if (current.value.comparableTo(next)){
                wasChanged = true;
            }
                }
    }

//    public double sum() {
//        Element tmp = first;
//        double sum = 0;
//        while (tmp != null) {
//            sum += tmp.value.doubleValue();
//            tmp = tmp.next;
//        }
//        return sum;
//    }

    public static void main(String[] args) {

        LinkedList<Student> list = new LinkedList<>();
        list.add(new Student(21));
        list.add(new Student(23));
        list.print();
        System.out.println("===");
        list.add(new Student(55));
        list.print();
        System.out.println("====");
        list.remove(new Student(21));
        list.print();

    }

}

class Element<T extends Comparable> {
    T value;
    Element<T> next;
}