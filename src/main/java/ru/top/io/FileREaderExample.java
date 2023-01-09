package ru.top.io;

import java.io.*;

public class FileREaderExample {

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/JProjects/java223/example_directory/run/skip/java/exampleFile.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:/JProjects/java223/example_directory/run/skip/java/output.txt"))) {
             String line = "";
             while ((line = bufferedReader.readLine()) != null) {
                 System.out.println(line);
                 bufferedWriter.write(line + "\n");
             }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
