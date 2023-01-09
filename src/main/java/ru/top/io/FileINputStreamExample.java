package ru.top.io;

import java.io.*;

public class FileINputStreamExample {

    public static void main(String[] args) {
        File fileOutput = new File("D:/JProjects/java223/example_directory/run/skip/java/output.txt");
        createNewFileIfNotExist(fileOutput);

        try (InputStream inputStream = new FileInputStream("D:/JProjects/java223/example_directory/run/skip/java/exampleFile.txt");
             OutputStream outputStream = new FileOutputStream("D:/JProjects/java223/example_directory/run/skip/java/output.txt")) {
            byte buffer[] = new byte[inputStream.available()];
            inputStream.read(buffer);
            outputStream.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createNewFileIfNotExist(File fileOutput) {
        if (fileOutput.exists()) {
            return;
        }
        try {
            fileOutput.createNewFile();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
