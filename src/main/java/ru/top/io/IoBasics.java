package ru.top.io;

import java.io.File;
import java.io.IOException;

public class IoBasics {

    public static void main(String[] args) throws InterruptedException {
        File directory = new File("D:/JProjects/java214/java-core/example_directory/java");
        directory.mkdirs();

        File fileByPath = new File("D:/JProjects/java214/java-core/example_directory/java/exampleFile.txt");
        if (!fileByPath.exists()) {
            try {
                if (fileByPath.createNewFile()) {
                    System.out.println("file was create");
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
