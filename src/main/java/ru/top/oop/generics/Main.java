package ru.top.oop.generics;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] strings = {"str1", "str2"};
        Array<String> stringArray = new Array<>(strings);
        System.out.println(Arrays.toString(stringArray.getArray()));

        Integer[] integers = {1, 4, 8, 10};
        Array<Integer> integerArray = new Array<>(integers);
        System.out.println(Arrays.toString(integerArray.getArray()));

        Car[] cars = new Car[]{new Car()};
        Array<Car> carArray = new Array<>(cars);
        System.out.println(Arrays.toString(carArray.getArray()));
    }
}
