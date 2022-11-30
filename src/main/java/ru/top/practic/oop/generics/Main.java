package ru.top.practic.oop.generics;

public class Main {

    //Написать класс-контейнер, реализующий логику работы
    //одномерного безразмерного динамического массива.
    //Имя класса MyArrayList.
    //Структура данных – массив.
    //Типы хранимых данных – объекты любых классов (использовать параметизированные типы (generics)).
    //В классе должно быть три поля:
    //■ ссылка на инкапсулированный массив (можно назвать
    //data);
    //■ текущее количество существующих элементов в массиве
    //(int size);
    //■ текущая емкость массива ( , по умолчанию 10)
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.pushBack(2);
        System.out.println(myArrayList.getSize());
        myArrayList.popFront();
        System.out.println(myArrayList.getSize());
    }
}
