package com.cydeo.tasks;

import java.util.Comparator;
import java.util.stream.Stream;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                //    .map(dish -> dish.getName())
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print the length of the name of each dish
        DishData.getAll().stream()
                .map(Dish::getName)
                //   .map(dish -> dish.length())
                .map(String::length)
                .forEach(System.out::println);

        //Print three high calories dish name(>300)

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        //Print all dish name that are below 400 calories in sorted
        System.out.println("Task 4");



        DishData.getAll().stream() // What i have in the stream?? Dish(Rice , Other ,400)
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName) //RICE stream <dish>
                .forEach(System.out::println);



    }
}
