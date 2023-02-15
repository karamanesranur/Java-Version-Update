package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class DishData {

    public static List<Dish> getAll() {

        return Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("fries", true, 530, Type.OTHER),
                new Dish("rice", true, 300, Type.OTHER),
                new Dish("fruit", true, 120, Type.OTHER),
                new Dish("pizza", true, 750, Type.OTHER),
                new Dish("prawns", false, 300, Type.OTHER),
                new Dish("salmon", false, 350, Type.FISH)
        );
    }

}

