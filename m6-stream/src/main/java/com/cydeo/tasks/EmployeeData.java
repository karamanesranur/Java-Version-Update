package com.cydeo.tasks;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100 , "Mike" , "mike@cydeo.com" , Arrays.asList("2022028765" , "67878899")),
                new Employee(101 , "Ozzy" , "ozzy@cydeo.com" , Arrays.asList("20225428765" , "457527899")),
                new Employee(102 , "Peter" , "peter@cydeo.com" , Arrays.asList("857028765" , "8586869"))
        );
    }
}
