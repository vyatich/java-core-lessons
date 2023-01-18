package ru.top.practic.concurrent.practice4;

import java.util.Scanner;

public class Main {

//Задание 4
//Пользователь с клавиатуры вводит путь к файлу и слово
//для поиска. После чего запускается поток. Он ищет это
//слово в файле. Результат поиска возвращается в main.
    public static void main(String[] args) throws InterruptedException {
        String fileName = "D:\\JProjects\\java214\\java-core\\example_directory\\run\\skip\\java\\poema.txt";
        Scanner scanner = new Scanner(System.in);
        String wordForFind = scanner.nextLine();

        FinderTask finderTask = new FinderTask(fileName, wordForFind);
        Thread finderThread = new Thread(finderTask);
        finderThread.start();
        finderThread.join();

        System.out.println(finderTask.isResult());
    }
}
