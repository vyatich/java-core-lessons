package ru.top.practic.oop.practice3;

import java.util.Arrays;

public class Practice3 {

//    Задание 3
//Создайте класс «Страна». Необходимо хранить
//в полях класса: название страны, название континента, количество жителей в стране, телефонный код
//страны, название столицы, название городов страны.
//Реализуйте методы класса для ввода данных, вывода
//данных, реализуйте доступ к отдельным полям через
//методы класса.

    public static void main(String[] args) {
        Country country = new Country();
        String[] townName = {"Москва", "Псков", "Тверь"};
        country.setTownName(townName);
        System.out.println(Arrays.toString(country.getTownName()));

        country.setContinent(Continent.getByRusDescription("Артика"));
        System.out.println(country.getContinent());
    }
}
