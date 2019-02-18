package com.advancedFeatures.exceptions;


public class Student {
    private String[] arr = {"Dima", "Misha", "Roma"};

    public void checkName(String name) throws CustomException {
        for (String nameFromArray : arr) {
            if (nameFromArray.equals(name)) {
                System.out.println("This name is in the list");
                return;
            }
        }
        throw new CustomException("There is no such name");

    }

    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.checkName("Rusa");
        } catch (CustomException e) {
            e.printStackTrace();
        }

    }
}
