package com.advancedFeatures.stream.ten;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example3 {

    //group by example
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("John", "Smith", 20),
                new Person("Sarah", "Connor", 30));

        Map<Integer,  List<Person>> personByAge = personList
                .stream()
                .collect(Collectors.groupingBy(p -> p.getAge()));
        System.out.println(personByAge);
        System.out.println("Groups by department: ");
        Employee[] arrOfEmps = {
                new Employee(1, "Jeff Bezos",100000.0, Employee.DepartmentType.IT),
                new Employee(2, "Bill Gates", 200000.0, Employee.DepartmentType.IT),
                new Employee(3, "Mark Zuckerberk", 300000.0, Employee.DepartmentType.IT),
                new Employee(4, "Feride", 1000.0, Employee.DepartmentType.IT)
        };
        System.out.println(groupEmployeesByDepartment(Arrays.asList(arrOfEmps)));
    }
    private static Map<Employee.DepartmentType, List<Employee>> groupEmployeesByDepartment
            (List<Employee> employeeList){
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartmentType));
    }

}
