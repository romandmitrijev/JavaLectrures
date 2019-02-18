package com.advancedFeatures.stream.ten;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

    //write a method which returns # of employee get higher than 10 000 eur
    //write a method which returns an employee who has max salary
    public static void main(String[] args) {
        Employee[] arrOfEmps = {
                new Employee(1, "Jeff Bezos",100000.0, Employee.DepartmentType.IT),
                new Employee(2, "Bill Gates", 200000.0, Employee.DepartmentType.IT),
                new Employee(3, "Mark Zuckerberk", 300000.0, Employee.DepartmentType.IT),
                new Employee(4, "Feride", 1000.0, Employee.DepartmentType.IT)
        };

        System.out.println(findEmployeeHighestSalary(arrOfEmps));
        System.out.println(findEmployeeHigherThanAHundredThousand(arrOfEmps));

    }

    public static Employee findEmployeeHighestSalary (Employee[] arrayOfEmps){
        return Arrays.asList(arrayOfEmps).stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchFieldError::new);

    }

    public static List<Employee> findEmployeeHigherThanAHundredThousand (Employee[] arrayOfEmps){
        return Arrays.asList(arrayOfEmps).stream().filter(employee -> employee != null)
                .filter(employee -> employee.getSalary()>100000)
                .collect(Collectors.toList());
    }
}
