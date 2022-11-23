package ru.top.practic.oop.practice1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Practice1 {

    //            Задание 1
    //Реализуйте класс «Человек». Необходимо хранить
    //в полях класса: ФИО, дату рождения, контактный телефон, город, страну, домашний адрес. Реализуйте методы
    //класса для ввода данных, вывода данных, реализуйте
    //доступ к отдельным полям через методы класса

    public static void main(String[] args) {
        Human human = new Human("no fio" ,new Date("2007 11 21"));
//        human.setBirthday(LocalDate.of(2007, 11, 21));
//        System.out.println(human.getBirthday());
//        human.setBirthday(LocalDate.of(2007, Month.NOVEMBER, 21));
//        System.out.println(human.getBirthday());
//        human.setBirthday(LocalDate.parse("2007-11-21"));
//        System.out.println(human.getBirthday());
        human.setBirthday(new Date("2007 11 21"));
        System.out.println(human.getBirthday());
    }
}
