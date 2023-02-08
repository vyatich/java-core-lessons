package ru.top.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        File writeFile = new File("D:\\JProjects\\java214\\java-core\\example_directory\\skip\\java\\"
                + Thread.currentThread().getName() + ".txt");

        System.out.println(Math.ceil(3.499999));

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(writeFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
//            throw new CustomException("Файл не найден");
        }

        System.out.println("After");
    }
}
