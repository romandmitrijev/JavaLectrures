package com.lectureSecondPart.generic;


public class LinkedList<T extends Comparable<T>> {

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

    public void sort() {
        Element<T> i = first;
        while (i != null) {

            Element<T> j = i.next;
            while (j != null) {
                if (i.value.comparableTo(j.value) == 0) {
                    T temp = i.value;
                    i.value = j.value;
                    j.value = temp;
                }
                j = j.next;
            }

            i = i.next;
        }

    }

    public void sidesSwap() {

        if (first == null)
            return;

        Element<T> i = first;
        Element<T> j = i;

        while (j.next != null) {
            j = j.next;
        }
        T temp = i.value;
        i.value = j.value;
        j.value = temp;

    }


//    public static void main(String[] args) {
//        Student[] students = new Student[4];
//        students[0] = new Student(32);
//        students[1] = new Student(22);
//        students[2] = new Student(25);
//        students[3] = new Student(19);
//
//        for (Student s : students) {
//            System.out.println(s);
//        }
//
//        for (int i = 0; i < students.length - 1; ++i) {
//            for (int j = i + 1; j < students.length; ++j) {
//                if (students[i].comparableTo(students[j]) == 1) {
//                    Student temp = students[i];
//                    students[i] = students[j];
//                    students[j] = temp;
//                }
//            }
//        }
//        System.out.println("Sorted array");
//
//        for (Student s : students) {
//            System.out.println(s);
//        }

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

        list.add(new Student(23));
        list.add(new Student(19));
        list.add(new Student(21));
        list.print();
        System.out.println("===");

        Student a = new Student(55);
        list.add(a);
        list.print();
        System.out.println("====");

        list.remove(a);
        list.print();
        System.out.println("====");

        list.sort();
        list.print();
        System.out.println("====");

        list.sidesSwap();
        list.print();
    }

}

class Element<T extends Comparable> {
    T value;
    Element<T> next;
}