package ru.top.practic.concurrent.practice5;

import java.util.List;

public class SyncExample {

//    Задание 1
//При старте приложения запускаются три потока.
//Первый поток заполняет массив случайными числами.
//Два других потока ожидают заполнения. Когда массив
//заполнен оба потока запускаются. Первый поток находит
//сумму элементов массива, второй поток среднеарифметическое значение в массиве. Полученный массив, сумма
//и среднеарифметическое возвращаются в метод main,
//где должны быть отображены.

    public static List<Integer> list;
    public static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        FillThread fillThread = new FillThread();
        fillThread.start();

        CalculateTask sumTask = new CalculateTask(numbers -> numbers.stream().mapToInt(n -> n).sum());
        Thread sumThread = new Thread(sumTask);
        sumThread.start();

        CalculateTask avgTask = new CalculateTask(numbers -> numbers.stream().mapToInt(n -> n).average().getAsDouble());
        Thread avgThread = new Thread(avgTask);
        avgThread.start();

        fillThread.join();
        sumThread.join();
        avgThread.join();
        System.out.println(sumTask.getResult());
        System.out.println(avgTask.getResult());
    }
}
