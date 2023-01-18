package ru.top.practic.concurrent.practice4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinderTask implements Runnable {

    private final String filePath;
    private final String word;

    private boolean result;

    public FinderTask(String filePath, String word) {
        this.filePath = filePath;
        this.word = word;
    }

    public boolean isResult() {
        return result;
    }

    @Override
    public void run() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(word)) {
                    result = true;
                    return;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
