package com.cydeo;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        //   Predicate <Integer> pred = (p) -> p % 2 == 0 ? true : false; // -> implementation of the interface method

        Calculate sum = (x, y) -> System.out.println(x + y);

        Calculate s1 = (x, y) -> Calculator.findSum(x, y);

        //Reference to Static Method
        Calculate s2 = Calculator::findSum; // class name :: method name
        s2.calculate(10, 20);


        //Reference to a instance method
        Calculator obj = new Calculator();
        Calculate s3 = obj::findMultiply;


        Calculate s4 = new Calculator()::findMultiply;

        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i);

        BiFunction<String, Integer, String> func2 = String::substring;

        Function<Integer, Double> b = new MyClass()::method;
        BiFunction<MyClass, Integer, Double> b1 = MyClass::method;


        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out :: println;


        // FUNCTIONAL PROGRAMMING
    }
}
