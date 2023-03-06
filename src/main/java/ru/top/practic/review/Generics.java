package ru.top.practic.review;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("sfsdfsdf");
        List<Integer> numbers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        System.out.println(strings.getClass().equals(numbers.getClass())); //true
        System.out.println(numbers.getClass().equals(doubles.getClass())); //true
    }

}
