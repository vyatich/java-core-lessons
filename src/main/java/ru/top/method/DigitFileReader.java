package ru.top.method;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DigitFileReader {

    private final String path;

    public DigitFileReader(String path) {
        this.path = path;
    }

    public List<Integer> getDigits() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.path));
            List<Integer> result = bufferedReader.lines()
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .toList();
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
