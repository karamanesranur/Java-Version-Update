package com.cydeo.tasks;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
         //Print all emails
        System.out.println("Print All Emails");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("Print All Phone Numbers");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumber().stream())
                .forEach(System.out::println);


        System.out.println("Print All Phone Numbers with Double Colon");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);
        }


    }

