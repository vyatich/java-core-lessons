package ru.top.practic.concurrent.practice6;

import java.io.File;

public class Main {

// После
//чего запускаются три потока. Первый поток заполняет
//файл случайными числами. Два других потока ожидают
//заполнения. Когда файл заполнен оба потока стартуют.
//Первый поток находит все простые числа, второй поток
//факториал каждого числа в файле. Результаты поиска
//каждый поток должен записать в новый файл. В методе
//main необходимо отобразить статистику выполненных
//операций

    public static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        File file = new File("D:\\JProjects\\java214\\java-core\\example_directory\\run\\skip\\java\\"
                + Thread.currentThread().getName() + ".txt");
        FileFillThread fillThread = new FileFillThread(file);
        fillThread.start();

        SimpleNumbersFinderThread numbersFinderThread = new SimpleNumbersFinderThread(file);
        numbersFinderThread.start();

        FactorialFinderThread factorialFinderThread = new FactorialFinderThread(file);
        factorialFinderThread.start();

        numbersFinderThread.join();
        factorialFinderThread.join();
    }
}
