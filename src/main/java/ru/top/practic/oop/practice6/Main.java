package ru.top.practic.oop.practice6;

public class Main {

//    Задание 3
//Создать абстрактный базовый класс Worker (работника) с методом print(). Создайте четыре производных
//класса: President, Security, Manager, Engineer. Переопределите метод.
//Print() для вывода информации, соответствующей
//каждому типу работника.
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.print();
        programmer.doSomething();

        President president = new President();
        president.doSomething();
    }
}
