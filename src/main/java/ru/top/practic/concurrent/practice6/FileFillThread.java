package ru.top.practic.concurrent.practice6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class FileFillThread extends Thread {

    private final File file;

    public FileFillThread(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        synchronized (Main.lock) {
            List<Integer> integers = ThreadLocalRandom.current().ints(100,1, 100)
                    .boxed()
                    .toList();
            writeToFile(integers);
        }
    }

    public void writeToFile(List<Integer> numbers) {
        try {
            file.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Integer number : numbers) {
                bufferedWriter.write(number + "\n");
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
