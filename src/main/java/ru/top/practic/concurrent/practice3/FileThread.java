package ru.top.practic.concurrent.practice3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

public class FileThread implements Runnable {
    private final Predicate<Integer> predicate;

    public FileThread(Predicate<Integer> predicate) {
        this.predicate = predicate;
    }

    @Override
    public void run() {
        File file = new File("D:\\Project\\Java214\\java-core-lessons\\example_directory\\run\\skip\\java\\"
                + Thread.currentThread().getName() + ".txt");
        try {
            file.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            List<Integer> integersFilter = Main.numbers.stream()
                    .filter(predicate)
                    .toList();
            for (Integer current : integersFilter){
                writer.write(current+ "\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
