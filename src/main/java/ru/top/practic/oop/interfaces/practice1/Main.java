package ru.top.practic.oop.interfaces.practice1;

public class Main {

    //Создайте интерфейс IShow. В нём должно быть два
    //метода void Print() и void Print(String info). Метод Print()
    //отображает информацию, метод Print(String info) отображает информацию и то информационное сообщение,
    //которое было указано в параметре info.
    //Создайте класс Array (массив целого типа) с необходимыми методами. Этот класс должен имплементировать
    //интерфейс IShow.
    //Метод Print() — отображает на экран элементы массива.
    //Метод Print(String info) — отображает на экран элементы массива и информационное сообщение, указанное
    //в параметре info.
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{5, 6, 3, 2};
        Array array = new Array(integers);
        array.print();
        array.print("I love JAVA");
    }
}
