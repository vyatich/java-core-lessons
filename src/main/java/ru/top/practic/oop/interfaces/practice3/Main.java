package ru.top.practic.oop.interfaces.practice3;

import ru.top.practic.oop.interfaces.practice1.Array;

public class Main {

//Создайте интерфейс ISort. В нём должно быть два
//метода:
//■ void sortAsc() — сортировка по возрастанию;
//■ void sortDesc() — сортировка по убыванию.
//Класс, созданный в первом задании Array, должен
//имплементировать интерфейс ISort.
//Метод sortAsc — сортирует массив по возрастанию.
//Метод sortDesc — сортирует массив по убыванию
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{5, 6, 4, 2};
        Array array = new Array(integers);
        array.sortAsc();
        array.print();
        array.sortDesc();
        array.print();
    }
}
